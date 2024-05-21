; AHMAD ZAKY HUMAMI 50422138 2IA27
; CETAK NAMA LENGKAP LA2
CODE SEGMENT USE16
      ASSUME CS:CODE
BEG:
      MOV ah, 02
      MOV dl, 4EH ;N
      INT 21H
      MOV dl, 41H ;A
      INT 21H
      MOV dl, 4DH ;M
      INT 21H
      MOV dl, 41H ;A
      INT 21H
      MOV dl, 3AH ; :
      INT 21H

      MOV dl, 20H
      INT 21H

      MOV dl, 46H ; F
      INT 21H
      MOV dl, 45H ;E
      INT 21H
      MOV dl, 52H ;R
      INT 21H
      MOV dl, 52H ;R
      INT 21H
      MOV dl, 59H ;Y
      INT 21H
      

      MOV dl, AH
      int 21
      MOV dl, DH
      int 21


      
      MOV dl, 4BH ;K
      INT 21H
      MOV dl, 45H ;E
      INT 21H
      MOV dl, 4CH ;L
      INT 21H
      MOV dl, 41H ;A
      INT 21H
      MOV dl, 53H ;S
      INT 21H
      MOV dl, 3AH ; :
      INT 21H

      MOV dl, 20H
      INT 21H

      MOV dl, 32H ;2
      INT 21H
      MOV dl, 49H ;I
      INT 21H
      MOV dl, 41H ;A
      INT 21H
      MOV dl, 32H ;2
      INT 21H
      MOV dl, 36H ;6
      INT 21H

      MOV dl, aH
      int 21
      MOV dl, DH
      int 21



      MOV dl, 4EH ;N
      INT 21H
      MOV dl, 50H ;P
      INT 21H
      MOV dl, 4DH ;M
      INT 21H
      MOV dl, 3AH ; :
      INT 21H

      MOV dl, 20H
      INT 21H

      MOV dl, 35H ;5
      INT 21H
      MOV dl, 30H ;0
      INT 21H
      MOV dl, 34H ;4
      INT 21H
      MOV dl, 32H ;2
      INT 21H
      MOV dl, 32H ;2
      INT 21H
      MOV dl, 35H ;5
      INT 21H
      MOV dl, 37H ;7
      INT 21H
      MOV dl, 32H ;2
      INT 21H
CODE ENDS
END BEG