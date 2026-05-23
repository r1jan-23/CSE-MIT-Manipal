`timescale 1ns/1ps
`include "mux16to1.v"

module mux16to1_tb();

reg i0, i1, i2, i3;
reg i4, i5, i6, i7;
reg i8, i9, i10, i11;
reg i12, i13, i14, i15;

reg [3:0] sel;
wire y;

mux16to1 uut (
    .i0(i0), .i1(i1), .i2(i2), .i3(i3),
    .i4(i4), .i5(i5), .i6(i6), .i7(i7),
    .i8(i8), .i9(i9), .i10(i10), .i11(i11),
    .i12(i12), .i13(i13), .i14(i14), .i15(i15),
    .sel(sel),
    .y(y)
);

initial begin
    $dumpfile("mux16to1.vcd");
    $dumpvars(0,mux16to1_tb);

    i0=0;  i1=1;  i2=0;  i3=1;
    i4=0;  i5=1;  i6=0;  i7=1;
    i8=0;  i9=1;  i10=0; i11=1;
    i12=0; i13=1; i14=0; i15=1;

    sel=4'b0000; #10;
    sel=4'b0001; #10;
    sel=4'b0010; #10;
    sel=4'b0011; #10;
    sel=4'b0100; #10;
    sel=4'b0101; #10;
    sel=4'b0110; #10;
    sel=4'b0111; #10;
    sel=4'b1000; #10;
    sel=4'b1001; #10;
    sel=4'b1010; #10;
    sel=4'b1011; #10;
    sel=4'b1100; #10;
    sel=4'b1101; #10;
    sel=4'b1110; #10;
    sel=4'b1111; #10;

    $finish;
end

initial begin
    $monitor("sel=%b y=%b", sel, y);
end

endmodule
