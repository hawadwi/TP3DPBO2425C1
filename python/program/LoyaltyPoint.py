# class LoyaltyPoint
class LoyaltyPoint:

    def __init__(self, totalPoint: int, level: str, bonusSpesial: str):
        self._totalPoint = int(totalPoint)
        self._level = str(level)
        self._bonusSpesial = str(bonusSpesial)

    # Getter & Setter Total Point
    def getTotalPoint(self) -> int:
        return self._totalPoint

    def setTotalPoint(self, totalPoint: int) -> None:
        self._totalPoint = int(totalPoint)

    # Getter & Setter Level
    def getLevel(self) -> str:
        return self._level

    def setLevel(self, level: str) -> None:
        self._level = str(level)

    # Getter & Setter Bonus Spesial
    def getBonusSpesial(self) -> str:
        return self._bonusSpesial

    def setBonusSpesial(self, bonusSpesial: str) -> None:
        self._bonusSpesial = str(bonusSpesial)
