`timescale 1ns/1ps
`include "qn2_a.v"

module qn2_a_tb();

reg A,B,C,D;
wire f;

qn2_a two_a(A,B,C,D,f);

initial
begin
    $dumpfile("qn2_a.vcd");
    $dumpvars(0,qn2_a_tb);

    A=0;B=0;C=0;D=0;
    #10 A=0;B=0;C=0;D=1;
    #10 A=0;B=0;C=1;D=0;
    #10 A=0;B=0;C=1;D=1;

    #10 A=0;B=1;C=0;D=0;
    #10 A=0;B=1;C=0;D=1;
    #10 A=0;B=1;C=1;D=0;
    #10 A=0;B=1;C=1;D=1;

    #10 A=1;B=0;C=0;D=0;
    #10 A=1;B=0;C=0;D=1;
    #10 A=1;B=0;C=1;D=0;
    #10 A=1;B=0;C=1;D=1;

    #10 A=1;B=1;C=0;D=0;
    #10 A=1;B=1;C=0;D=1;
    #10 A=1;B=1;C=1;D=0;
    #10 A=1;B=1;C=1;D=1;

    #10 $finish;
end

initial
begin
    $monitor("A=%b B=%b C=%b D=%b F=%b",A,B,C,D,f);
end

endmodule
