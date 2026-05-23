module mux2to1(
    input A,
    input B,
    input S,
    output reg Y
);

always @(*) begin
    if (S == 0)
        Y = A;
    else
        Y = B;
end

endmodule

module mux4to1(
    input I0, I1, I2, I3,
    input [1:0] S,
    output Y
);

wire w1, w2;

mux2to1 m1(.A(I0), .B(I1), .S(S[0]), .Y(w1));
mux2to1 m2(.A(I2), .B(I3), .S(S[0]), .Y(w2));
mux2to1 m3(.A(w1), .B(w2), .S(S[1]), .Y(Y));

endmodule
