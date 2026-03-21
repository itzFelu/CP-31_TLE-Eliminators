3 5
aba
ababa       <-- (-1)

2 8
bk
kbkbkbkb

bk -> bkbk -> bkbkbkbk -> bkbkbkbkbkbkbkbk -> bkbkbkbkbkbkbkbkbkbkbkbkbkbkbkbk
2       4       8                   16                      32

a -> aa -> aaaa -> aaaaaaaa -> aaaaa..aaaaaaa -> aaaaaaaaaa...aaaaaaaaaaaaaa
1     2     4        8              16                  32
s0   s1     s2      s3          s4                     s5

(worst case)


----------------------

Logic is brute force, we need to check the substring by appending the input string again and again

but for this problem, as it is mentioned that n*m <= 25. The maximum answer can be 5.
That means, if the substring can be found by performing the operations, it should be withing 5 times.
otherwise the substring can not be found.
final verdict: our answers can only be 0 or 1 or 2 or 3 or 4 or  5

n*m = 25
n = 1, m = 25,  After 5 operations, length of input string x, will become 32
if s, whose length is 25, must be in that string,

so we will only check in 5 modified strings of x.

-------------------------------

