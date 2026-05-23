`timescale 1ns/1ps
`include "fulladder.v"

module fulladder_tb();

reg a, b, cin;
wire sum, carry;

fulladder fa( .a(a),.b(b),.cin(cin),.sum(sum),.carry(carry));

initial begin
    $dumpfile("fulladder.vcd");
    $dumpvars(0,fulladder_tb);
    $display("A B Cin | SUM CARRY");

    a=0; b=0; cin=0; #10;
    a=0; b=0; cin=1; #10;
    a=0; b=1; cin=0; #10;
    a=0; b=1; cin=1; #10;
    a=1; b=0; cin=0; #10;
    a=1; b=0; cin=1; #10;
    a=1; b=1; cin=0; #10;
    a=1; b=1; cin=1; #10;

    $finish;
end

initial begin
    $monitor("%b %b  %b  |  %b    %b", a, b, cin, sum, carry);
end

endmodule
