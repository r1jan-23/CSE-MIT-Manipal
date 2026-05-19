module qn4(input A,B,C,D, output f);

wire A1,B1,D1;
wire n1,n2,n3;

assign A1 = ~(A & A);
assign B1 = ~(B & B);
assign D1 = ~(D & D);

assign n1 = ~(A1 & C);
assign n2 = ~(B1 & C);
assign n3 = ~(B & D1);

assign f = ~(n1 & n2 & n3);

endmodule
