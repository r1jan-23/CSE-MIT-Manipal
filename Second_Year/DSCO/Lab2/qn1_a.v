module qn1_a(input A,B,C,D, output f);

assign f = (C & D) |
           (~A & B) |
           (C & ~B) |
           (B & ~C & ~D);

endmodule
