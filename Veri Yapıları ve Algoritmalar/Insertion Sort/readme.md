# [22, 27, 16, 2, 18, 6] -> Insertion Sort
## 1. Yukarıda verilen dizinin sort türüne göre aşamalarını yazınız. 
Öncelikle en küçük elemanı bulur ve dizinin ilk elemanıyla en küçük elemanın yerini değiştirir (2 ile 22 yer değiştirir.). Sonrasında dizideki 2. en küçük elemanı bulup dizinin 2. elemanıyla yer değiştirir(6 ile 27 yer değiştirir.). Dizinin tamamı bitene kadar işlem devam eder. Adımlar sırasıyla :
1. Adım => 2 ile 22 yer değiştirir.
2. Adım => 6 ile 27 yer değiştirir.
3. Adım => 16 zaten 3. en küçük eleman olduğu için yeri değiştirilmez.
4. Adım => 18 ile 22 yer değiştirir.
## 2. Big-O gösterimini yazınız.
O(n^2)
## 3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
Worst Case => 2. Adım
Best Case => 3. Adım
Average Case => 4. Adım 

## 4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
Average Case kapsamına girer.

# [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
### 1. Adım : 
2 ile 7 yer değiştirir. [2,3,5,8,7,9,4,15,6]
### 2. Adım : 
3 ikinci en küçük eleman olduğu için yer değiştirmez [2,3,5,8,7,9,4,15,6]
### 3. Adım : 
4 ile 5 yer değiştirir. [2,3,4,8,7,9,5,15,6]
### 4. Adım : 
5 ile 8 yer değiştirir. [2,3,4,5,7,9,8,15,6]

