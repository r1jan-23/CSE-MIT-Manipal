`timescale 1ns/1ps
`include "halfadder.v"

module halfadder_tb();

reg a, b;
wire sum, carry;

halfadder out(.a(a),.b(b),.sum(sum),.carry(carry));

initial begin
    $dumpfile("halfadder.vcd");
    $dumpvars(0,halfadder_tb);
    $display("A B | SUM CARRY");

    a=0; b=0; #10;
    a=0; b=1; #10;
    a=1; b=0; #10;
    a=1; b=1; #10;

    $finish;
end

initial begin
    $monitor("%b %b |  %b    %b", a, b, sum, carry);
end

endmodule
