`timescale 1ns/1ps
`include "multiplier_2bit.v"
module multiplier_2bit_tb();

reg [1:0] a, b;
wire [3:0] product;

multiplier_2bit uut(
    .a(a),
    .b(b),
    .product(product)
);

initial begin
  $dumpfile("multiplier_2bit.vcd");
    $dumpvars(0,multiplier_2bit_tb);
    $display("A   B   | Product");

    a=2'b00; b=2'b00; #10;
    a=2'b01; b=2'b10; #10;
    a=2'b10; b=2'b11; #10;
    a=2'b11; b=2'b11; #10;

    $finish;
end

initial begin
    $monitor("%b %b |  %b", a, b, product);
end

endmodule
