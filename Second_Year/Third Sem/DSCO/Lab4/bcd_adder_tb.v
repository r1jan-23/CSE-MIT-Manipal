`timescale 1ns/1ps
`include "bcd_adder.v"
module bcd_adder_tb();

reg [3:0] a, b;
reg cin;
wire [3:0] sum;
wire carry;

bcd_adder ba(
    .a(a),
    .b(b),
    .cin(cin),
    .sum(sum),
    .carry(carry)
);

initial begin
  $dumpfile("bcd_adder.vcd");
    $dumpvars(0,bcd_adder_tb);
    $display("A    B    Cin | Carry Sum");

    a=4'd4; b=4'd3; cin=0; #10;
    a=4'd5; b=4'd7; cin=0; #10;
    a=4'd9; b=4'd8; cin=0; #10;
    a=4'd2; b=4'd6; cin=1; #10;

    $finish;
end

initial begin
    $monitor("%d   %d    %b  |   %b    %d",
              a, b, cin, carry, sum);
end

endmodule
