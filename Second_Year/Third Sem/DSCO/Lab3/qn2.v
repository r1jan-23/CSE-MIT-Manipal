module qn2(input A,B,C,D, output f);

wire B1,C1,D1;
wire t1;

assign B1 = ~(B | B);
assign C1 = ~(C | C);
assign D1 = ~(D | D);

assign t1 = ~(C1 | D1);

assign f = ~(B | t1);

endmodule
