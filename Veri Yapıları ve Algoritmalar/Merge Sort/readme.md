# [16,21,11,8,12,22] -> Merge Sort
## 1. Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
1. Adım => Dizi ikiye ayrılır. [16,21,11] , [8,12,22]
2. Adım => bölünen diziler de ikiye ayrılır. [16],[21,11] , [8],[12,22]
3. Adım => bölünen diziler kendi içlerinde sıralanır [16], [11,21] , [8],[12,22]
4. Adım => bölünen diziler sıralanarak birbirlerine eklenir. [11,16,21],[8,12,22]
5. Adım => Diziler tekrar sıralanrak birleştirilir. [8,11,12,16,21,22]
## 2. Big-O gösterimini yazınız.
O(nlogn)

