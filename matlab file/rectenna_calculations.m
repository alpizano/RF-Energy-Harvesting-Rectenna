clear
clc

C = 3*10^8;

Er = 3.55;
fr = 2.4*10^(9);
h = 0.813;

w = (C*1000/(2*fr))*(2/(Er+1))^(1/2);

Ereff = (Er + 1)/2 + ((Er-1)/2)*(1+12*h/w)^(-1/2);

num1 = (Ereff + 0.3);
num2 = (w/h + 0.264);
num3 = (Ereff - 0.258);
num4 = (w/h + 0.8);

deltaL = 0.412*((num1*num2)/(num3*num4))*h;

l = (C*1000)/(2*fr*(Ereff)^(1/2)) - 2*deltaL;

groundL = 6*h+l;
groundW = 6*h+w;

fprintf('Width: %f\n' ,w)
fprintf('Ereff: %f\n' ,Ereff)
fprintf('deltaL: %f\n' ,deltaL)
fprintf('Length: %g\n', l)
fprintf('Ground length: %f\n', groundL)
fprintf('Ground width: %f\n', groundW)