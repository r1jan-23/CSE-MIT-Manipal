module qn2(a,b,c,d,f,g);

input a,b,c,d;
output f,g;

wire x;

assign x = ~(a & b);

assign f = x ^ c ^ d;

assign g = ~(b | c | d);

endmodule
