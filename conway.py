import os
import time

def prox(grid,m,n):
    future = [[0 for i in range(n)] for j in range(m)]
    
    for l in range(m):
        
        for p in range(n):
            
            alive = 0
            
            for i in range(-1,2):
                
                for j in range(-1,2):
                    
                    if l+i >= 0 and  l+i < m and p+j >= 0 and p+j < n:
                        
                        alive += grid[l+i][p+j]
                        
            alive -= grid[l][p]
            
            if grid[l][p] == 1 and alive <2:
                future[l][p] = 0
                
            if grid[l][p] == 1 and alive >3:
                future[l][p] = 0
                
            if grid[l][p] == 0 and alive == 3:
                future[l][p] = 1
            else:
                future[l][p] = grid[l][p]
    for i in range(0,m):
        for j in range(0,n):
            if future[i][j] == 0:
                print(".",end="")
            else:
                print("#",end="")
        print()
    print()
                
m = 10
n = 10
grid = [ [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 ],
         [ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 ],
         [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]]

for i in range(0,m):
    for j in range(0,n):
        if grid[i][j] == 0:
            print(".",end="")
        else:
            print("#",end="")
    print()
print()

time.sleep(2)
os.system('clr')

prox(grid,m,n)
