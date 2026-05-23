module mux4to1 (
    input i0,
    input i1,
    input i2,
    input i3,
    input [1:0] sel,
    output y
);

assign y = (sel == 2'b00) ? i0 :
           (sel == 2'b01) ? i1 :
           (sel == 2'b10) ? i2 :
                            i3;

endmodule

module mux16to1 (
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

wire w1, w2, w3, w4;

mux4to1 m1 (
    .i0(i0),
    .i1(i1),
    .i2(i2),
    .i3(i3),
    .sel(sel[1:0]),
    .y(w1)
);

mux4to1 m2 (
    .i0(i4),
    .i1(i5),
    .i2(i6),
    .i3(i7),
    .sel(sel[1:0]),
    .y(w2)
);

mux4to1 m3 (
    .i0(i8),
    .i1(i9),
    .i2(i10),
    .i3(i11),
    .sel(sel[1:0]),
    .y(w3)
);

mux4to1 m4 (
    .i0(i12),
    .i1(i13),
    .i2(i14),
    .i3(i15),
    .sel(sel[1:0]),
    .y(w4)
);

mux4to1 m5 (
    .i0(w1),
    .i1(w2),
    .i2(w3),
    .i3(w4),
    .sel(sel[3:2]),
    .y(y)
);

endmodule

