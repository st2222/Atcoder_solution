import copy
N = input()
questions_input = list(map(int, input().split()))
num_of_drinks = int(input())
drink_input = list()
for i in range(num_of_drinks):
    drink_input.append(list(map(int, input().split())))
    
for drink in drink_input:
    questions = copy.copy(questions_input)
    questions[drink[0]-1] = drink[1]
    print(sum(questions))
    