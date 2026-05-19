module qn2_b(input A,B,C,D, output f);

assign f = (~A & ~B) |
           (B & D) |
           (A & ~C);

endmodule
