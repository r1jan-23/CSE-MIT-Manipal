module qn1(input A,B,C,D, output f);

wire A1,C1,D1;
wire t1,t2,t3;
wire n1,n2,n3;

assign A1 = ~(A & A);
assign C1 = ~(C & C);
assign D1 = ~(D & D);

assign n1 = ~(A1 & B);
assign n2 = ~(C & D1);
assign n3 = ~(B & C1);

assign f = ~(n1 & n2 & n3);

endmodule
