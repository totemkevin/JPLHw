hello:-write("Hello").

add(A,B,S):- S is A+B,write(S).

pr([]).
pr([X|R]):- write(X),pr(R).

sum_up(1,R):- R is 1.
sum_up(X,R):- Y is X-1,sum_up(Y,R1),R is R1+X.

append([],L,L).
append([H|T],L,[H|R]):- append(T,L,R).

addfirst([],L,L).
addfirst([H|T],L,O):- append(L,[H|T],O).

reverse([H|T],R,O):- addfirst(R,H,O1),reverse(T,O1,O).

add_oven([H|T],
