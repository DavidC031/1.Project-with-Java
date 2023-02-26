

 while abs(b-a) > tol
     c = (a+b)/2;
     if f(c) == 0
         break;
     elseif sign(f(c)) == sign(f(a))
         a = c;
    else
        b = c;
    end
 end
