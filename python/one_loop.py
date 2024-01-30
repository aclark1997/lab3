def one_loop(l: list) -> bool:
    i = 0
    while i < len(l):
        j = 0
        while j < len(l):
            if j != i and l[j] == l[i]:
                return True
            j = j + 1
        i = i + 1
    return False

if __name__ == "__main__":
    print(one_loop([1,2,3,4]));
