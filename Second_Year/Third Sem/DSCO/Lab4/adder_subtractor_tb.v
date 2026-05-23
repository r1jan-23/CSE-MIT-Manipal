`timescale 1ns/1ps
`include "adder_subtractor.v"
module adder_subtractor_tb();

reg [3:0] a, b;
reg mode;
wire [3:0] result;
wire carry;

adder_subtractor as(
    .a(a),
    .b(b),
    .mode(mode),
    .result(result),
    .carry(carry)
);

initial begin
    $dumpfile("adder_subtractor.vcd");
    $dumpvars(0,adder_subtractor_tb);
    $display("Mode A     B     | Carry Result");

    mode = 0;
    a = 4'b0101; b = 4'b0011; #10;

    mode = 1;
    a = 4'b0101; b = 4'b0011; #10;

    mode = 1;
    a = 4'b1000; b = 4'b0010; #10;

    $finish;
end

initial begin
    $monitor("%b    %b %b |   %b     %b",
              mode, a, b, carry, result);
end

endmodule
