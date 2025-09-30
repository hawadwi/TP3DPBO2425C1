#pragma once
#include <string>
using namespace std;

/* Class LoyaltyPoint yang mewarisi Pelanggan */
class LoyaltyPoint {
    protected:
        int totalPoint;       // Total poin yang dimiliki pelanggan
        string level;         // Level loyalty (misal: Bronze, Silver, Gold, Platinum)
        string bonusSpesial;  // Bonus spesial untuk level tertentu

    public:
        // Constructor kosong
        LoyaltyPoint() {
            totalPoint = 0;
            level = "";
            bonusSpesial = "";
        }

        // Constructor lengkap
        LoyaltyPoint(int totalPoint, string level, string bonusSpesial) {
            this->totalPoint = totalPoint;
            this->level = level;
            this->bonusSpesial = bonusSpesial;
        }

        // Getter dan Setter
        int getTotalPoint() {
            return totalPoint;
        }

        void setTotalPoint(int totalPoint) {
            this->totalPoint = totalPoint;
        }

        string getLevel() {
            return level;
        }

        void setLevel(string level) {
            this->level = level;
        }

        string getBonusSpesial() {
            return bonusSpesial;
        }

        void setBonusSpesial(string bonusSpesial) {
            this->bonusSpesial = bonusSpesial;
        }
        ~LoyaltyPoint(){}
};


