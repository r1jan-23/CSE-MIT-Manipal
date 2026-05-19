module qn3(input A,B,C,D, output f);

wire A1,C1,t1,D1;

assign A1 = ~(A | A);
assign C1 = ~(C | C);

assign t1 = ~(A1 | C1);

assign D1 = ~(D | D);

assign f = ~(D1 | t1);

endmodule
