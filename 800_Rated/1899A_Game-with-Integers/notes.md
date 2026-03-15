we have the cases as

3 ->
num % 3 == 0:   [num = 3, 6, 9, 12, ...]
    in this case, whatever operation the first person makes, second one will do the opposite
    if the First person does +1 / -1
    second person will do -1 / +1
    e.g. num = 6
    first does +1, num = 7
    second does -1, num = 6. Second wins

    if first does -1, num = 5
    second does +1, num = 6. Second wins

1 -> 
num % 3 == 1:   [num = 1, 4, 10, 13, ...]
    "num -1" will make the number divisible by 3
    Hence single move will be enough
    and "First" will will

2 -> 
num % 3 == 2:   [num = 2, 5, 11, 14, ...]
    "num +1" will make the number divisible by 3
    Hence single move will be enough
    and "First" will will
