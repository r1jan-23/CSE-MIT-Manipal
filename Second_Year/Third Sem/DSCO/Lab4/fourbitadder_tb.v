`timescale 1ns/1ps
`include "fourbitadder.v"
module fourbitadder_tb();

reg [3:0] a, b;
wire [3:0] sum;
wire carry;

fourbitadder fba(
    .a(a),
    .b(b),
    .sum(sum),
    .carry(carry)
);

initial begin
   $dumpfile("fourbitadder.vcd");
    $dumpvars(0,fourbitadder_tb);
    $display("A     B     | Carry Sum");

    a = 4'b0001; b = 4'b0010; #10;
    a = 4'b0101; b = 4'b0011; #10;
    a = 4'b1111; b = 4'b0001; #10;
    a = 4'b1010; b = 4'b0101; #10;

    $finish;
end

initial begin
    $monitor("%b %b |   %b    %b", a, b, carry, sum);
end

endmodule
