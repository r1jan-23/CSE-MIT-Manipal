module bcd_adder(
    input [3:0] a,
    input [3:0] b,
    input cin,
    output [3:0] sum,
    output carry
);

wire [4:0] temp_sum;
wire [4:0] corrected_sum;

assign temp_sum = a + b + cin;

assign corrected_sum =
    (temp_sum > 9) ? (temp_sum + 6) : temp_sum;

assign sum = corrected_sum[3:0];
assign carry = corrected_sum[4];

endmodule
