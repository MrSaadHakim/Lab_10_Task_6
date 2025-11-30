# Lab 10 Task 6 – Bank Lookup Program

This program identifies the bank name based on the first three digits of a Polish bank account number.

The program loads data from the official NBP (National Bank of Poland) website and searches for the corresponding bank entry.

---

### Program flow
1. User enters the first three digits of their bank account number.  
2. The program downloads and reads data from:  
   `https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt`  
3. It locates the matching line and extracts:  
   - Abbreviated bank number  
   - Bank name  
4. The program displays the name of the bank associated with that account.

---

**Author:** Saad Hakim  
**Student ID:** 61551  
**Group:** 7  
