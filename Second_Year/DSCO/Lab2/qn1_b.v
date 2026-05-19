module qn1_b(input A,B,C,D, output f);

assign f = (C & ~B) |
           (D & ~B) |
           (B & ~C & ~D);

endmodule
