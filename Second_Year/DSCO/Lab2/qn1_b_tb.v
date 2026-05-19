`timescale 1ns/1ps
`include "qn1_b.v"
module qn1_b_tb();

reg a,b,c,d;
wire f;

qn1_b one_b(a,b,c,d,f);

initial
begin
    $dumpfile("qn1_b.vcd");
    $dumpvars(0,qn1_b_tb);

   
    a=0; b=0; c=0; d=0;
    #10 a=0; b=0; c=0; d=1;
    #10 a=0; b=0; c=1; d=0;
    #10 a=0; b=0; c=1; d=1;

    #10 a=0; b=1; c=0; d=0;
    #10 a=0; b=1; c=0; d=1;
    #10 a=0; b=1; c=1; d=0;
    #10 a=0; b=1; c=1; d=1;

    #10 a=1; b=0; c=0; d=0;
    #10 a=1; b=0; c=0; d=1;
    #10 a=1; b=0; c=1; d=0;
    #10 a=1; b=0; c=1; d=1;

    #10 a=1; b=1; c=0; d=0;
    #10 a=1; b=1; c=0; d=1;
    #10 a=1; b=1; c=1; d=0;
    #10 a=1; b=1; c=1; d=1;

    #10
     $finish;
end

initial
begin
    $monitor("A=%b B=%b C=%b D=%b F=%b",a,b,c,d,f);
end

endmodule
