alf = [" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "y", "z", "w"]
str_array = ["h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d"]
# str_array = ["a", "l", "p", "e", "r", "e", "n", " ", "k", "u", "r", "t"]

las = ""

for j in range(len(str_array)):
    for i in range(len(alf)):
        if alf[i] != str_array[j]:
            print(las + alf[i])
        elif alf[i] == str_array[j]:
            las += alf[i]
            break

print(las)