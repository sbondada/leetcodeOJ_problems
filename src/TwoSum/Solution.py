#!/usr/bin/python

class Solution(object):
# @return a tuple, (index1, index2)

    def __init__(self):
        pass

    def contains(self,array, element):
        index_list = []
        count_correcter = 0;
        while element in array and len(index_list)<2:
            index_list.append(array.index(element)+1+count_correcter)
            array.remove(element)
            count_correcter += 1
        return index_list

    def twoSum(self, num, target):
        index1 = None
        index2 = None
        for n in num:
            if target-n in num:
                if n != (target-n):
                    index1 = num.index(n)+1       
                    index2 = num.index(target-n)+1
                    return (index1, index2)
                # handling the case when there is a single n in the array
                # and target-n is same as n
                else:
                    index_list = self.contains(list(num), n)
                    if len(index_list) > 1:
                        index1 = index_list[0]
                        index2 = index_list[1]
                        return (index1, index2)
        return (index1, index2)

if __name__ == '__main__':
    s_obj = Solution()
    num_list = [0, 3, 4, 0]
    target = 0
    ( index1, index2 ) = s_obj.twoSum(num_list, target)
    print index1
    print index2
