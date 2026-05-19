`timescale 1ns/1ps
`include "qn2_b.v"

module qn2_b_tb();

reg A,B,C,D;
wire f;

qn2_b two_b(A,B,C,D,f);

initial
begin
    $dumpfile("qn2_b.vcd");
    $dumpvars(0,qn2_b_tb);

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
