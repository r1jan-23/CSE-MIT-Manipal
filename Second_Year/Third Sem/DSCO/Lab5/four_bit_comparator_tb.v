`timescale 1ns/1ps
`include "four_bit_comparator.v"
module four_bit_comparator_tb();

reg [3:0] A, B;
wire A_greater, A_equal, A_less;

four_bit_comparator fourbc(
    .A(A),
    .B(B),
    .A_greater(A_greater),
    .A_equal(A_equal),
    .A_less(A_less)
);

initial begin
     $dumpfile("four_bit_comparator.vcd");
    $dumpvars(0,four_bit_comparator_tb);
    
    $display("A B | Greater Equal Less");

    A = 4'b0101; B = 4'b0011; #10;
    A = 4'b0110; B = 4'b0110; #10;
    A = 4'b0010; B = 4'b1000; #10;

    $finish;
end

initial begin
    $monitor("%b %b |   %b      %b     %b",
              A, B, A_greater, A_equal, A_less);
end

endmodule
