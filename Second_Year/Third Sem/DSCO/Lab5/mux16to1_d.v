module mux2to1 (
    input a,
    input b,
    input sel,
    output y
);

assign y = (sel == 1'b0) ? a : b;

endmodule


module mux8to1 (
    input i0,
    input i1,
    input i2,
    input i3,
    input i4,
    input i5,
    input i6,
    input i7,
    input [2:0] sel,
    output reg y
);

always @(*) begin
    case(sel)
        3'b000: y = i0;
        3'b001: y = i1;
        3'b010: y = i2;
        3'b011: y = i3;
        3'b100: y = i4;
        3'b101: y = i5;
        3'b110: y = i6;
        3'b111: y = i7;
    endcase
end

endmodule


module mux16to1_d (
    input i0,
    input i1,
    input i2,
    input i3,
    input i4,
    input i5,
    input i6,
    input i7,
    input i8,
    input i9,
    input i10,
    input i11,
    input i12,
    input i13,
    input i14,
    input i15,
    input [3:0] sel,
    output y
);

wire w1, w2;

mux8to1 m1 (
    .i0(i0),
    .i1(i1),
    .i2(i2),
    .i3(i3),
    .i4(i4),
    .i5(i5),
    .i6(i6),
    .i7(i7),
    .sel(sel[2:0]),
    .y(w1)
);

mux8to1 m2 (
    .i0(i8),
    .i1(i9),
    .i2(i10),
    .i3(i11),
    .i4(i12),
    .i5(i13),
    .i6(i14),
    .i7(i15),
    .sel(sel[2:0]),
    .y(w2)
);

mux2to1 m3 (
    .a(w1),
    .b(w2),
    .sel(sel[3]),
    .y(y)
);

endmodule
