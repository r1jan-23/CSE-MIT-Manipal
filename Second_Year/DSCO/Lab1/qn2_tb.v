`timescale 1ns/1ps

`include "qn2.v"

module qn2_tb;

reg a,b,c,d;
wire f,g;


qn2 uut (.a(a),.b(b),.c(c),.d(d),.f(f),.g(g));

initial 
begin

$dumpfile("qn2_tb.vcd");
$dumpvars(0, qn2_tb);
  
    a=0; b=0; c=0; d=0;
    #10;

    a=0; b=0; c=0; d=1;
    #10;

    a=0; b=1; c=0; d=1;
    #10;

    a=1; b=0; c=1; d=0;
    #10;

    a=1; b=1; c=1; d=1;
    #10;

$display("Test complete");
end

endmodule
