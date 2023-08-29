class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        totalGas = 0;
        totalCost = 0;

        for g in gas: totalGas+= g
        for c in cost: totalCost+= c

        if totalGas < totalCost: return -1

        fuelTank = 0
        start = 0
        for i in range(len(gas)):
            fuelTank += gas[i]
            fuelTank -= cost[i]

            if fuelTank < 0:
                fuelTank = 0
                start = i+1

        return start