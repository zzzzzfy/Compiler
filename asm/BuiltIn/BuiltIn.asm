default rel

global __hasValue
global __getValue
global __setValue
global __print
global __println
global __getString
global __getInt
global __toString
global __string_length
global __string_substring
global __string_parseInt
global __string_ord
global __stringConcate
global __stringCompare
global __value
global __has
global __real_addr
global main

extern strcmp
extern __sprintf_chk
extern memcpy
extern malloc
extern __isoc99_scanf
extern puts
extern __printf_chk


SECTION .text   6

__hasValue:
        mov     rax, rdi
        mov     rdx, qword 1323E34A2B10BF67H
        imul    rdx
        mov     rax, rdi
        sar     rax, 63
        sar     rdx, 3
        sub     rdx, rax
        mov     eax, 107
        imul    rdx, rax
        mov     rax, rdi
        sub     rax, rdx
        mov     rdx, rax
        xor     eax, eax

        cmp     qword [abs __real_addr+rdx*8], rdi
        jz      L_002
L_001:

        ret





ALIGN   8
L_002:  cmp     rsi, 209
        ja      L_001
        imul    rdx, rdx, 210
        add     rsi, rdx

        mov     rax, qword [abs __has+rsi*8]
        ret






ALIGN   8

__getValue:
        mov     rax, rdi
        mov     rdx, qword 1323E34A2B10BF67H
        imul    rdx
        mov     rax, rdi
        sar     rax, 63
        sar     rdx, 3
        sub     rdx, rax
        mov     eax, 107
        imul    rdx, rax
        sub     rdi, rdx
        imul    rdi, rdi, 210
        add     rsi, rdi

        mov     rax, qword [abs __value+rsi*8]
        ret






ALIGN   8

__setValue:
        cmp     rsi, 209
        mov     r9, rdx
        ja      L_008
        mov     r8, qword 1323E34A2B10BF67H
        mov     rax, rdi
        mov     r10d, 107
        imul    r8
        mov     rax, rdi
        sar     rax, 63
        mov     r8, rdx
        sar     r8, 3
        sub     r8, rax
        mov     rax, rdi
        imul    r8, r10
        sub     rax, r8
        mov     r8, rax

        mov     rax, qword [abs __real_addr+rax*8]
        cmp     rax, rdi
        jz      L_007
        test    rax, rax
        je      L_012
        imul    rax, r8, 1680
        mov     edx, 1680

        lea     rdi, [abs __has+rax]
        test    dil, 01H
        jne     L_013
L_003:  test    dil, 02H
        jne     L_014
L_004:  test    dil, 04H
        jne     L_015
L_005:  mov     ecx, edx
        xor     eax, eax
        shr     ecx, 3
        test    dl, 04H
        rep stosq
        jnz     L_011
        test    dl, 02H
        jnz     L_010
L_006:  and     edx, 01H
        jnz     L_009




ALIGN   8
L_007:  mov     rax, r9
        imul    r8, r8, 210
        add     rsi, r8

        mov     qword [abs __has+rsi*8], 1

        mov     qword [abs __value+rsi*8], r9
        ret





ALIGN   8
L_008:

        ret





ALIGN   8
L_009:  mov     byte [rdi], 0
        jmp     L_007





ALIGN   8
L_010:  xor     eax, eax
        add     rdi, 2
        mov     word [rdi-2H], ax
        and     edx, 01H
        jz      L_007
        jmp     L_009





ALIGN   8
L_011:  mov     dword [rdi], 0
        add     rdi, 4
        test    dl, 02H
        jz      L_006
        jmp     L_010





ALIGN   8
L_012:

        mov     qword [abs __real_addr+r8*8], rdi
        jmp     L_007





ALIGN   8
L_013:

        mov     byte [abs __has+rax], 0
        add     rdi, 1
        mov     dl, -113
        jmp     L_003





ALIGN   8
L_014:  xor     ecx, ecx
        add     rdi, 2
        sub     edx, 2
        mov     word [rdi-2H], cx
        jmp     L_004





ALIGN   8
L_015:  mov     dword [rdi], 0
        sub     edx, 4
        add     rdi, 4
        jmp     L_005







ALIGN   16

__print:
        lea     rdx, [rdi+8H]
        mov     esi, L_032
        mov     edi, 1
        xor     eax, eax
        jmp     __printf_chk







ALIGN   16

__println:
        add     rdi, 8
        jmp     puts






ALIGN   8

__getString:
        push    rbp
        mov     esi, __buffer.3442
        mov     edi, L_032
        xor     eax, eax
        push    rbx
        mov     ebx, __buffer.3442
        sub     rsp, 8
        call    __isoc99_scanf
L_016:  mov     edx, dword [rbx]
        add     rbx, 4
        lea     eax, [rdx-1010101H]
        not     edx
        and     eax, edx
        and     eax, 80808080H
        jz      L_016
        mov     edx, eax
        shr     edx, 16
        test    eax, 8080H
        cmove   eax, edx
        lea     rdx, [rbx+2H]
        cmove   rbx, rdx
        add     al, al
        sbb     rbx, 3
        sub     rbx, __buffer.3442
        lea     edi, [rbx+8H]
        movsxd  rdi, edi
        call    malloc
        mov     rbp, rax
        lea     rdx, [rbx+1H]
        movsxd  rax, ebx
        lea     rdi, [rbp+8H]
        mov     qword [rbp], rax
        mov     esi, __buffer.3442
        call    memcpy
        add     rsp, 8
        mov     rax, rbp
        pop     rbx
        pop     rbp
        ret







ALIGN   16

__getInt:
        sub     rsp, 24
        mov     edi, L_033
        xor     eax, eax
        lea     rsi, [rsp+8H]
        call    __isoc99_scanf
        mov     rax, qword [rsp+8H]
        add     rsp, 24
        ret


        nop

ALIGN   16
__toString:
        push    rbp
        mov     rbp, rdi
        mov     edi, 32
        push    rbx
        sub     rsp, 8
        call    malloc
        lea     rdi, [rax+8H]
        mov     rbx, rax
        mov     r8, rbp
        mov     ecx, L_033
        mov     edx, 24
        mov     esi, 1
        xor     eax, eax
        call    __sprintf_chk
        cdqe
        mov     qword [rbx], rax
        add     rsp, 8
        mov     rax, rbx
        pop     rbx
        pop     rbp
        ret







ALIGN   16

__string_length:
        mov     rax, qword [rdi]
        ret







ALIGN   16

__string_substring:
        push    r15
        push    r14
        push    r13
        movsxd  r13, esi
        push    r12
        mov     r12d, edx
        sub     r12d, r13d
        push    rbp
        mov     rbp, rdi
        lea     edi, [r12+0AH]
        push    rbx
        lea     ebx, [r12+1H]
        movsxd  rdi, edi
        sub     rsp, 8
        call    malloc
        movsxd  rdx, ebx
        test    ebx, ebx
        mov     qword [rax], rdx
        jle     L_018
        lea     edi, [r13+8H]
        add     r13, rbp
        lea     rcx, [rax+18H]
        lea     rdx, [r13+8H]
        lea     rsi, [r13+18H]
        cmp     rcx, rdx
        lea     rdx, [rax+8H]
        setbe   cl
        cmp     rsi, rdx
        setbe   dl
        or      cl, dl
        je      L_019
        cmp     ebx, 15
        jbe     L_019
        mov     esi, ebx
        xor     edx, edx
        xor     r8d, r8d
        shr     esi, 4
        mov     ecx, esi
        shl     ecx, 4
L_017:  movdqu  xmm0, oword [r13+rdx+8H]
        add     r8d, 1
        movdqu  oword [rax+rdx+8H], xmm0
        add     rdx, 16
        cmp     r8d, esi
        jc      L_017
        cmp     ebx, ecx
        je      L_018
        lea     edx, [rdi+rcx]
        lea     r13d, [rcx+8H]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r13d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+1H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r11d, [rcx+9H]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r11d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+2H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r10d, [rcx+0AH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r10d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+3H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r9d, [rcx+0BH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r9d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+4H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     r8d, [rcx+0CH]
        movsxd  rdx, edx
        movzx   esi, byte [rbp+rdx]
        movsxd  rdx, r8d
        mov     byte [rax+rdx], sil
        lea     edx, [rcx+5H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        lea     esi, [rcx+0DH]
        movsxd  rdx, edx
        movzx   r14d, byte [rbp+rdx]
        movsxd  rdx, esi
        mov     byte [rax+rdx], r14b
        lea     edx, [rcx+6H]
        cmp     ebx, edx
        jle     L_018
        add     edx, edi
        movsxd  rdx, edx
        movzx   r15d, byte [rbp+rdx]
        lea     edx, [rcx+0EH]
        movsxd  r14, edx
        mov     byte [rax+r14], r15b
        lea     r14d, [rcx+7H]
        cmp     ebx, r14d
        jle     L_018
        add     r14d, edi
        cmp     ebx, r13d
        movsxd  r14, r14d
        movzx   r15d, byte [rbp+r14]
        lea     r14d, [rcx+0FH]
        movsxd  r14, r14d
        mov     byte [rax+r14], r15b
        jle     L_018
        add     r13d, edi
        cmp     ebx, r11d
        movsxd  r13, r13d
        movzx   r14d, byte [rbp+r13]
        lea     r13d, [rcx+10H]
        movsxd  r13, r13d
        mov     byte [rax+r13], r14b
        jle     L_018
        add     r11d, edi
        cmp     ebx, r10d
        movsxd  r11, r11d
        movzx   r13d, byte [rbp+r11]
        lea     r11d, [rcx+11H]
        movsxd  r11, r11d
        mov     byte [rax+r11], r13b
        jle     L_018
        add     r10d, edi
        cmp     ebx, r9d
        movsxd  r10, r10d
        movzx   r11d, byte [rbp+r10]
        lea     r10d, [rcx+12H]
        movsxd  r10, r10d
        mov     byte [rax+r10], r11b
        jle     L_018
        add     r9d, edi
        cmp     ebx, r8d
        movsxd  r9, r9d
        movzx   r10d, byte [rbp+r9]
        lea     r9d, [rcx+13H]
        movsxd  r9, r9d
        mov     byte [rax+r9], r10b
        jle     L_018
        add     r8d, edi
        cmp     ebx, esi
        movsxd  r8, r8d
        movzx   r9d, byte [rbp+r8]
        lea     r8d, [rcx+14H]
        movsxd  r8, r8d
        mov     byte [rax+r8], r9b
        jle     L_018
        add     esi, edi
        cmp     ebx, edx
        movsxd  rsi, esi
        movzx   r8d, byte [rbp+rsi]
        lea     esi, [rcx+15H]
        movsxd  rsi, esi
        mov     byte [rax+rsi], r8b
        jle     L_018
        add     edx, edi
        add     ecx, 22
        movsxd  rdx, edx
        movsxd  rcx, ecx
        movzx   edx, byte [rbp+rdx]
        mov     byte [rax+rcx], dl
L_018:  add     r12d, 9
        movsxd  r12, r12d
        mov     byte [rax+r12], 0
        add     rsp, 8
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        pop     r15
        ret





ALIGN   16
L_019:  movsxd  rdi, edi
        xor     ecx, ecx
        add     rbp, rdi




ALIGN   16
L_020:  movzx   edx, byte [rbp+rcx]
        mov     byte [rax+rcx+8H], dl
        add     rcx, 1
        cmp     ebx, ecx
        jg      L_020
        jmp     L_018







ALIGN   16

__string_parseInt:
        movsx   edx, byte [rdi+8H]
        cmp     dl, 45
        jz      L_024
        lea     rcx, [rdi+8H]
        xor     edi, edi
L_021:  lea     eax, [rdx-30H]
        cmp     al, 9
        mov     eax, 0
        ja      L_023




ALIGN   8
L_022:  sub     edx, 48
        lea     rax, [rax+rax*4]
        add     rcx, 1
        movsxd  rdx, edx
        lea     rax, [rdx+rax*2]
        movsx   edx, byte [rcx]
        lea     esi, [rdx-30H]
        cmp     sil, 9
        jbe     L_022
L_023:  mov     rdx, rax
        neg     rdx
        test    edi, edi
        cmovne  rax, rdx
        ret





ALIGN   8
L_024:  lea     rcx, [rdi+9H]
        movsx   edx, byte [rdi+9H]
        mov     edi, 1
        jmp     L_021


        nop

ALIGN   16
__string_ord:
        movsx   rax, byte [rdi+rsi+8H]
        ret







ALIGN   16

__stringConcate:
        push    r15
        push    r14
        push    r13
        push    r12
        mov     r12, rsi
        push    rbp
        mov     rbp, rdi
        push    rbx
        sub     rsp, 8
        mov     rbx, qword [rdi]
        mov     r13, qword [rsi]
        lea     r14, [rbx+r13]
        lea     rdi, [r14+9H]
        call    malloc
        test    rbx, rbx
        mov     qword [rax], r14
        jle     L_026
        lea     rcx, [rbp+8H]
        lea     rdx, [rax+18H]
        lea     rsi, [rbp+18H]
        cmp     rcx, rdx
        lea     rdx, [rax+8H]
        setae   cl
        cmp     rsi, rdx
        setbe   dl
        or      cl, dl
        je      L_029
        cmp     rbx, 15
        jbe     L_029
        mov     rsi, rbx
        xor     ecx, ecx
        xor     edi, edi
        shr     rsi, 4
        mov     rdx, rsi
        shl     rdx, 4
L_025:  movdqu  xmm0, oword [rbp+rcx+8H]
        add     rdi, 1
        movdqu  oword [rax+rcx+8H], xmm0
        add     rcx, 16
        cmp     rsi, rdi
        ja      L_025
        cmp     rbx, rdx
        je      L_026
        lea     r14d, [rdx+8H]
        movsxd  r14, r14d
        movzx   ecx, byte [rbp+r14]
        mov     byte [rax+r14], cl
        lea     ecx, [rdx+1H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r10d, [rdx+9H]
        movsxd  rcx, r10d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+2H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r9d, [rdx+0AH]
        movsxd  rcx, r9d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+3H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     r8d, [rdx+0BH]
        movsxd  rcx, r8d
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+4H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     edi, [rdx+0CH]
        movsxd  rcx, edi
        movzx   esi, byte [rbp+rcx]
        mov     byte [rax+rcx], sil
        lea     ecx, [rdx+5H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     esi, [rdx+0DH]
        movsxd  rcx, esi
        movzx   r11d, byte [rbp+rcx]
        mov     byte [rax+rcx], r11b
        lea     ecx, [rdx+6H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        jle     L_026
        lea     ecx, [rdx+0EH]
        movsxd  r11, ecx
        movzx   r15d, byte [rbp+r11]
        mov     byte [rax+r11], r15b
        lea     r11d, [rdx+7H]
        movsxd  r11, r11d
        cmp     rbx, r11
        jle     L_026
        lea     r11d, [rdx+0FH]
        cmp     rbx, r14
        movsxd  r11, r11d
        movzx   r15d, byte [rbp+r11]
        mov     byte [rax+r11], r15b
        jle     L_026
        lea     r11d, [rdx+10H]
        movsxd  r10, r10d
        cmp     rbx, r10
        movsxd  r11, r11d
        movzx   r14d, byte [rbp+r11]
        mov     byte [rax+r11], r14b
        jle     L_026
        lea     r10d, [rdx+11H]
        movsxd  r9, r9d
        cmp     rbx, r9
        movsxd  r10, r10d
        movzx   r11d, byte [rbp+r10]
        mov     byte [rax+r10], r11b
        jle     L_026
        lea     r9d, [rdx+12H]
        movsxd  r8, r8d
        cmp     rbx, r8
        movsxd  r9, r9d
        movzx   r10d, byte [rbp+r9]
        mov     byte [rax+r9], r10b
        jle     L_026
        lea     r8d, [rdx+13H]
        movsxd  rdi, edi
        cmp     rbx, rdi
        movsxd  r8, r8d
        movzx   r9d, byte [rbp+r8]
        mov     byte [rax+r8], r9b
        jle     L_026
        lea     edi, [rdx+14H]
        movsxd  rsi, esi
        cmp     rbx, rsi
        movsxd  rdi, edi
        movzx   r8d, byte [rbp+rdi]
        mov     byte [rax+rdi], r8b
        jle     L_026
        lea     esi, [rdx+15H]
        movsxd  rcx, ecx
        cmp     rbx, rcx
        movsxd  rsi, esi
        movzx   edi, byte [rbp+rsi]
        mov     byte [rax+rsi], dil
        jle     L_026
        add     edx, 22
        movsxd  rdx, edx
        movzx   ecx, byte [rbp+rdx]
        mov     byte [rax+rdx], cl
L_026:  test    r13, r13
        jle     L_031
        lea     rsi, [r13+1H]
        add     rbx, 8
        mov     edx, 1
        xor     ecx, ecx




ALIGN   8
L_027:  movzx   edi, byte [r12+rdx+7H]
        add     rcx, rax
        mov     byte [rcx+rbx], dil
        mov     rcx, rdx
        add     rdx, 1
        cmp     rdx, rsi
        jnz     L_027
L_028:  add     r13, rax
        mov     byte [r13+rbx], 0
        add     rsp, 8
        pop     rbx
        pop     rbp
        pop     r12
        pop     r13
        pop     r14
        pop     r15
        ret





ALIGN   8
L_029:  xor     edx, edx




ALIGN   8
L_030:  movzx   ecx, byte [rbp+rdx+8H]
        mov     byte [rax+rdx+8H], cl
        add     rdx, 1
        cmp     rbx, rdx
        jnz     L_030
        jmp     L_026

L_031:  add     rbx, 8
        jmp     L_028







ALIGN   16

__stringCompare:
        sub     rsp, 8
        add     rsi, 8
        add     rdi, 8
        call    strcmp
        add     rsp, 8
        cdqe
        ret



SECTION .data


SECTION .bss    align=32

__value:
        resq    22472

__has:
        resq    22472

__real_addr:
        resq    108

__buffer.3442:
        resb    1048576


SECTION .text.startup 6

main:
        xor     eax, eax
        jmp     __init



SECTION .rodata.str1.1

L_032:
        db 25H, 73H, 00H

L_033:
        db 25H, 6CH, 64H, 00H


;=====================================================================
	 section .text
_max:
	b0:
	push rbp
	mov rbp, rsp
	mov rdx, rdi
	mov rcx, rsi
	cmp rdx, rcx
	jg b1
	b2:
	mov rax, rcx
	jmp b3
	b1:
	mov rax, rdx
	b3:
	leave
	ret
_equ:
	b4:
	push rbp
	mov rbp, rsp
	mov rdx, rdi
	mov rcx, rsi
	cmp rdx, 0
	je b5
	b6:
	cmp rcx, 0
	je b7
	b8:
	mov rdx, qword [rdx]
	cmp rdx, qword [rcx]
	je b9
	b10:
	mov rax, 0
	jmp b11
	b9:
	mov rax, 1
	b11:
	jmp b12
	b7:
	b13:
	mov rax, 0
	b14:
	jmp b12
	b5:
	cmp rcx, 0
	je b15
	b16:
	b17:
	mov rax, 0
	b18:
	jmp b12
	b15:
	b19:
	mov rax, 1
	b20:
	b12:
	leave
	ret
_merge:
	b21:
	push rbp
	mov rbp, rsp
	push r12
	push rbx
	push r13
	push r14
	mov r14, rdi
	mov r13, rsi
	mov r12, rdx
	mov rdx, r13
	mov rcx, r14
	add rcx, 1
	mov rsi, rcx
	mov rdi, rdx
	call _splay_tree.find
	mov rcx, rax
	mov rbx, rcx
	mov rcx, rbx
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r13
	mov qword [rcx], rbx
	mov rcx, r13
	mov rsi, r14
	mov rdi, rcx
	call _splay_tree.find
	mov rcx, rax
	mov rbx, rcx
	mov rdx, rbx
	mov rcx, r13
	mov rsi, qword [rcx]
	mov rdi, rdx
	call _Node.rotto
	mov rcx, rbx
	mov rdx, qword [rcx + 80]
	mov rcx, r12
	mov rcx, qword [rcx]
	mov qword [rdx + 16], rcx
	mov rcx, r12
	mov rcx, qword [rcx]
	mov qword [rcx + 88], rbx
	mov rcx, rbx
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r13
	mov qword [rcx], rbx
	b22:
	pop r14
	pop r13
	pop rbx
	pop r12
	leave
	ret
_main:
	b23:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	push r15
	push r12
	push rbx
	push r13
	push r14
	mov rcx, qword [g_0]
	mov qword [g_0], rcx
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov rcx, qword [g_2]
	mov qword [g_2], rcx
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rcx, qword [g_4]
	mov qword [g_4], rcx
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rcx, qword [g_6]
	mov qword [g_6], rcx
	call __getInt
	mov rcx, rax
	mov qword [g_2], rcx
	call __getInt
	mov rcx, rax
	mov qword [g_4], rcx
	mov rdi, 8
	call malloc
	mov r14, rax
	mov rdi, r14
	call _splay_tree.splay_tree
	mov rcx, r14
	mov qword [g_0], rcx
	mov rdi, 8
	call malloc
	mov r14, rax
	mov rdi, r14
	call _splay_tree.splay_tree
	mov rcx, r14
	mov qword [g_1], rcx
	mov rcx, qword [g_3]
	neg rcx
	mov rdx, qword [g_5]
	mov qword [rdx + 8], rcx
	mov rcx, qword [g_2]
	mov rsi, rcx
	add rsi, 1
	mov rcx, qword [g_3]
	neg rcx
	mov rdx, qword [g_5]
	mov qword [rdx + rsi * 8 + 8], rcx
	mov rcx, 1
	mov qword [rbp - 8], rcx
	b24:
	mov rdx, qword [rbp - 8]
	mov rcx, qword [g_2]
	cmp rdx, rcx
	jle b25
	b26:
	mov rcx, qword [g_0]
	mov rdi, rcx
	mov rcx, qword [g_2]
	add rcx, 1
	mov rdx, qword [g_5]
	mov qword [g_5], rdx
	mov rdx, rcx
	mov rsi, 0
	call _splay_tree.build_tree
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rcx, 1
	mov qword [rbp - 8], rcx
	b27:
	mov rcx, qword [rbp - 8]
	mov rdx, qword [g_4]
	cmp rcx, rdx
	jle b28
	b29:
	mov rax, 0
	b30:
	mov rcx, qword [g_0]
	mov qword [g_0], rcx
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov rcx, qword [g_2]
	mov qword [g_2], rcx
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rcx, qword [g_4]
	mov qword [g_4], rcx
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rcx, qword [g_6]
	mov qword [g_6], rcx
	pop r14
	pop r13
	pop rbx
	pop r12
	pop r15
	leave
	ret
	b28:
	call __getString
	mov rcx, rax
	mov r14, rcx
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov r13, rax
	mov rcx, qword [g_6]
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp r13, rcx
	jne b31
	b32:
	call __getInt
	mov rcx, rax
	mov rbx, rcx
	call __getInt
	mov rcx, rax
	mov r13, rcx
	mov r12, 1
	b33:
	cmp r12, r13
	jle b34
	b35:
	mov rcx, qword [g_1]
	mov rdx, qword [g_5]
	mov qword [g_5], rdx
	mov rdx, r13
	mov rsi, 1
	mov rdi, rcx
	call _splay_tree.build_tree
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rcx, rbx
	add rcx, 1
	mov r13, rcx
	mov rcx, qword [g_0]
	mov rbx, rcx
	mov rcx, qword [g_1]
	mov r15, rcx
	b36:
	mov rcx, rbx
	mov rdx, r13
	add rdx, 1
	mov rsi, rdx
	mov rdi, rcx
	call _splay_tree.find
	mov rcx, rax
	mov r12, rcx
	mov rcx, r12
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov rcx, rbx
	mov qword [rcx], r12
	mov rcx, rbx
	mov rsi, r13
	mov rdi, rcx
	call _splay_tree.find
	mov rcx, rax
	mov r12, rcx
	mov rcx, r12
	mov rdx, rbx
	mov rsi, qword [rdx]
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r12
	mov rcx, qword [rcx + 80]
	mov rdx, r15
	mov rdx, qword [rdx]
	mov qword [rcx + 16], rdx
	mov rcx, r15
	mov rcx, qword [rcx]
	mov qword [rcx + 88], r12
	mov rcx, r12
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov rcx, rbx
	mov qword [rcx], r12
	b37:
	b31:
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov r13, rax
	mov rcx, qword [g_6]
	mov rsi, 1
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp r13, rcx
	jne b38
	b39:
	call __getInt
	mov rcx, rax
	mov r13, rcx
	call __getInt
	mov rcx, rax
	mov rdx, rcx
	mov rcx, qword [g_0]
	mov rsi, r13
	add rsi, 1
	mov rdi, r13
	add rdi, rdx
	mov rdx, rdi
	mov rdi, rcx
	call _splay_tree.del
	b38:
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp rcx, 82
	jne b40
	b41:
	call __getInt
	mov rcx, rax
	mov r13, rcx
	call __getInt
	mov rcx, rax
	mov rdx, rcx
	mov rcx, qword [g_0]
	mov rdi, rcx
	mov rcx, r13
	add rcx, 1
	mov rsi, r13
	add rsi, rdx
	mov rdx, rsi
	mov rsi, rcx
	call _splay_tree.rol
	b40:
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp rcx, 71
	jne b42
	b43:
	call __getInt
	mov rcx, rax
	mov r13, rcx
	call __getInt
	mov rcx, rax
	cmp rcx, 0
	jg b44
	b45:
	mov rdi, g_7
	call __print
	jmp b46
	b44:
	mov rdx, qword [g_0]
	mov rdi, rdx
	mov rsi, r13
	add rsi, 1
	mov rdx, r13
	add rdx, rcx
	call _splay_tree.getsum
	mov rcx, rax
	mov rdi, rcx
	call __toString
	mov rcx, rax
	mov rdi, rcx
	call __println
	b46:
	b42:
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp rcx, 77
	jne b47
	b48:
	mov rcx, r14
	mov rsi, 2
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	cmp rcx, 75
	je b49
	b50:
	mov rcx, qword [g_0]
	mov rdi, rcx
	call _splay_tree.getMax
	mov rcx, rax
	mov rdi, rcx
	call __toString
	mov rcx, rax
	mov rsi, g_8
	mov rdi, rcx
	call __stringConcate
	mov rcx, rax
	mov rdi, rcx
	call __print
	jmp b51
	b49:
	call __getInt
	mov rcx, rax
	mov r13, rcx
	call __getInt
	mov rcx, rax
	mov r14, rcx
	call __getInt
	mov rcx, rax
	mov rdx, qword [g_0]
	mov rdi, rdx
	mov rsi, r13
	add rsi, 1
	mov rdx, r13
	add rdx, r14
	call _splay_tree.change
	b51:
	b47:
	b52:
	mov rcx, qword [rbp - 8]
	inc rcx
	mov qword [rbp - 8], rcx
	jmp b27
	b34:
	call __getInt
	mov rdx, rax
	mov rcx, qword [g_5]
	mov qword [rcx + r12 * 8 + 8], rdx
	b53:
	inc r12
	jmp b33
	b25:
	call __getInt
	mov rsi, rax
	mov rdx, qword [g_5]
	mov rcx, qword [rbp - 8]
	mov qword [rdx + rcx * 8 + 8], rsi
	b54:
	mov rcx, qword [rbp - 8]
	inc rcx
	mov qword [rbp - 8], rcx
	jmp b24
_Node.copy:
	b55:
	push rbp
	mov rbp, rsp
	mov rdx, rdi
	mov rdi, rsi
	mov rcx, rdi
	mov rcx, qword [rcx]
	mov qword [rdx], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 8]
	mov qword [rdx + 8], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 16]
	mov qword [rdx + 16], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 24]
	mov qword [rdx + 24], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 32]
	mov qword [rdx + 32], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 40]
	mov qword [rdx + 40], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 48]
	mov qword [rdx + 48], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 56]
	mov qword [rdx + 56], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 64]
	mov qword [rdx + 64], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 72]
	mov qword [rdx + 72], rcx
	mov rsi, qword [rdx + 80]
	mov rcx, rdi
	mov rcx, qword [rcx + 80]
	mov rcx, qword [rcx + 8]
	mov qword [rsi + 8], rcx
	mov rsi, qword [rdx + 80]
	mov rcx, rdi
	mov rcx, qword [rcx + 80]
	mov rcx, qword [rcx + 16]
	mov qword [rsi + 16], rcx
	mov rcx, rdi
	mov rcx, qword [rcx + 88]
	mov qword [rdx + 88], rcx
	b56:
	leave
	ret
_Node.init:
	b57:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov rbx, rdi
	mov rcx, rsi
	mov qword [rbx], rdx
	mov qword [rbx + 16], 1
	mov qword [rbx + 32], 0
	mov qword [rbx + 48], 0
	mov qword [rbx + 40], 0
	mov qword [rbx + 24], rcx
	mov qword [rbx + 8], rcx
	mov qword [rbx + 56], rcx
	mov qword [rbx + 64], rcx
	mov qword [rbx + 72], rcx
	mov r14, 2
	lea rsi, [r14 * 8 + 8]
	mov rdi, rsi
	call malloc
	mov r13, rax
	mov qword [r13], 2
	b58:
	cmp r14, 0
	jg b59
	b60:
	mov qword [rbx + 80], r13
	mov rcx, qword [rbx + 80]
	mov qword [rcx + 8], 0
	mov rcx, qword [rbx + 80]
	mov qword [rcx + 16], 0
	mov qword [rbx + 88], 0
	b61:
	pop r14
	pop r13
	pop rbx
	leave
	ret
	b59:
	mov rdi, 8
	call malloc
	mov rcx, rax
	mov qword [rcx], 0
	mov qword [r13 + r14 * 8], rcx
	dec r14
	jmp b58
_Node.judge:
	b62:
	push rbp
	mov rbp, rsp
	mov rdx, rdi
	mov rcx, rsi
	mov rdx, qword [rdx + 80]
	mov rdx, qword [rdx + 8]
	b63:
	cmp rdx, 0
	je b64
	b65:
	cmp rcx, 0
	je b66
	b67:
	mov rdx, qword [rdx]
	cmp rdx, qword [rcx]
	je b68
	b69:
	mov rax, 0
	jmp b70
	b68:
	mov rax, 1
	b70:
	jmp b71
	b66:
	b72:
	mov rax, 0
	b73:
	jmp b71
	b64:
	cmp rcx, 0
	je b74
	b75:
	b76:
	mov rax, 0
	b77:
	jmp b71
	b74:
	b78:
	mov rax, 1
	b79:
	b71:
	cmp rax, 0
	jne b80
	b81:
	mov rax, 1
	jmp b82
	b80:
	mov rax, 0
	b82:
	leave
	ret
_Node.push_up:
	b83:
	push rbp
	mov rbp, rsp
	mov qword [rdi + 16], 1
	mov rcx, qword [rdi + 8]
	mov qword [rdi + 24], rcx
	mov rsi, 0
	b84:
	cmp rsi, 2
	jl b85
	b86:
	mov rcx, qword [rdi + 8]
	mov qword [rdi + 56], rcx
	mov rcx, qword [rdi + 8]
	mov qword [rdi + 64], rcx
	mov rcx, qword [rdi + 8]
	mov qword [rdi + 72], rcx
	mov rdx, qword [rdi + 8]
	mov rsi, qword [rdi + 8]
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + 8], 0
	je b87
	b88:
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 8]
	mov rcx, qword [rcx + 56]
	mov qword [rdi + 56], rcx
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 8]
	add rdx, qword [rcx + 24]
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 8]
	mov r8, qword [rcx + 64]
	mov rcx, 0
	b89:
	cmp r8, rcx
	jg b90
	b91:
	mov rax, rcx
	jmp b92
	b90:
	mov rax, r8
	b92:
	mov rcx, rax
	add rsi, rcx
	b87:
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + 16], 0
	je b93
	b94:
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 16]
	mov rcx, qword [rcx + 64]
	mov qword [rdi + 64], rcx
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 16]
	add rsi, qword [rcx + 24]
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 16]
	mov r8, qword [rcx + 56]
	mov rcx, 0
	b95:
	cmp r8, rcx
	jg b96
	b97:
	mov rax, rcx
	jmp b98
	b96:
	mov rax, r8
	b98:
	mov rcx, rax
	add rdx, rcx
	b93:
	mov r8, qword [rdi + 56]
	mov rcx, rdx
	b99:
	cmp r8, rcx
	jg b100
	b101:
	mov rax, rcx
	jmp b102
	b100:
	mov rax, r8
	b102:
	mov rcx, rax
	mov qword [rdi + 56], rcx
	mov rcx, qword [rdi + 64]
	mov rdx, rsi
	b103:
	cmp rcx, rdx
	jg b104
	b105:
	mov rax, rdx
	jmp b106
	b104:
	mov rax, rcx
	b106:
	mov rcx, rax
	mov qword [rdi + 64], rcx
	mov rsi, 0
	b107:
	cmp rsi, 2
	jl b108
	b109:
	mov rsi, qword [rdi + 8]
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + 8], 0
	je b110
	b111:
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 8]
	mov rdx, qword [rcx + 64]
	mov rcx, 0
	b112:
	cmp rdx, rcx
	jg b113
	b114:
	mov rax, rcx
	jmp b115
	b113:
	mov rax, rdx
	b115:
	mov rcx, rax
	add rsi, rcx
	b110:
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + 16], 0
	je b116
	b117:
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 16]
	mov rdx, qword [rcx + 56]
	mov rcx, 0
	b118:
	cmp rdx, rcx
	jg b119
	b120:
	mov rax, rcx
	jmp b121
	b119:
	mov rax, rdx
	b121:
	mov rcx, rax
	add rsi, rcx
	b116:
	mov rcx, qword [rdi + 72]
	mov rdx, rsi
	b122:
	cmp rcx, rdx
	jg b123
	b124:
	mov rax, rdx
	jmp b125
	b123:
	mov rax, rcx
	b125:
	mov rcx, rax
	mov qword [rdi + 72], rcx
	b126:
	leave
	ret
	b108:
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + rsi * 8 + 8], 0
	je b127
	b128:
	mov rcx, qword [rdi + 80]
	mov rdx, qword [rcx + rsi * 8 + 8]
	mov rcx, qword [rdi + 72]
	mov rdx, qword [rdx + 72]
	b129:
	cmp rcx, rdx
	jg b130
	b131:
	mov rax, rdx
	jmp b132
	b130:
	mov rax, rcx
	b132:
	mov rcx, rax
	mov qword [rdi + 72], rcx
	b127:
	b133:
	inc rsi
	jmp b107
	b85:
	mov rcx, qword [rdi + 80]
	cmp qword [rcx + rsi * 8 + 8], 0
	je b134
	b135:
	mov rcx, qword [rdi + 80]
	mov rdx, qword [rcx + rsi * 8 + 8]
	mov rcx, qword [rdi + 16]
	add rcx, qword [rdx + 16]
	mov qword [rdi + 16], rcx
	mov rcx, qword [rdi + 80]
	mov rdx, qword [rcx + rsi * 8 + 8]
	mov rcx, qword [rdi + 24]
	add rcx, qword [rdx + 24]
	mov qword [rdi + 24], rcx
	b134:
	b136:
	inc rsi
	jmp b84
_Node.addtag_ch:
	b137:
	push rbp
	mov rbp, rsp
	mov qword [rdi + 8], rsi
	mov rax, qword [rdi + 16]
	imul rsi
	mov rcx, rax
	mov qword [rdi + 24], rcx
	cmp rsi, 0
	jge b138
	b139:
	mov qword [rdi + 56], rsi
	mov qword [rdi + 64], rsi
	mov qword [rdi + 72], rsi
	jmp b140
	b138:
	mov rcx, qword [rdi + 24]
	mov qword [rdi + 56], rcx
	mov rcx, qword [rdi + 24]
	mov qword [rdi + 64], rcx
	mov rcx, qword [rdi + 24]
	mov qword [rdi + 72], rcx
	b140:
	mov qword [rdi + 32], 1
	mov qword [rdi + 40], rsi
	b141:
	leave
	ret
_Node.addtag_ro:
	b142:
	push rbp
	mov rbp, rsp
	mov rcx, qword [rdi + 80]
	mov rcx, qword [rcx + 8]
	mov rsi, qword [rdi + 80]
	mov rdx, qword [rdi + 80]
	mov rdx, qword [rdx + 16]
	mov qword [rsi + 8], rdx
	mov rdx, qword [rdi + 80]
	mov qword [rdx + 16], rcx
	mov rdx, qword [rdi + 56]
	mov rcx, qword [rdi + 64]
	mov qword [rdi + 56], rcx
	mov qword [rdi + 64], rdx
	mov rcx, qword [rdi + 48]
	xor rcx, 1
	mov qword [rdi + 48], rcx
	b143:
	leave
	ret
_Node.push_down:
	b144:
	push rbp
	mov rbp, rsp
	push r13
	push r14
	mov r13, rdi
	cmp qword [r13 + 32], 1
	jne b145
	b146:
	mov r14, 0
	b147:
	cmp r14, 2
	jl b148
	b149:
	mov qword [r13 + 32], 0
	b145:
	cmp qword [r13 + 48], 1
	jne b150
	b151:
	mov r14, 0
	b152:
	cmp r14, 2
	jl b153
	b154:
	mov qword [r13 + 48], 0
	b150:
	b155:
	pop r14
	pop r13
	leave
	ret
	b153:
	mov rcx, qword [r13 + 80]
	cmp qword [rcx + r14 * 8 + 8], 0
	je b156
	b157:
	mov rcx, qword [r13 + 80]
	mov rcx, qword [rcx + r14 * 8 + 8]
	mov rdi, rcx
	call _Node.addtag_ro
	b156:
	b158:
	inc r14
	jmp b152
	b148:
	mov rcx, qword [r13 + 80]
	cmp qword [rcx + r14 * 8 + 8], 0
	je b159
	b160:
	mov rcx, qword [r13 + 80]
	mov rcx, qword [rcx + r14 * 8 + 8]
	mov rsi, qword [r13 + 40]
	mov rdi, rcx
	call _Node.addtag_ch
	b159:
	b161:
	inc r14
	jmp b147
_Node.rot:
	b162:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov r14, rdi
	mov r13, qword [r14 + 88]
	mov rcx, r13
	mov rsi, r14
	mov rdi, rcx
	call _Node.judge
	mov rcx, rax
	mov rdi, rcx
	mov rcx, r13
	mov rcx, qword [rcx + 80]
	mov rsi, rdi
	xor rsi, 1
	mov rdx, qword [r14 + 80]
	mov rdx, qword [rdx + rsi * 8 + 8]
	mov qword [rcx + rdi * 8 + 8], rdx
	mov rcx, rsi
	mov rdx, qword [r14 + 80]
	mov qword [rdx + rcx * 8 + 8], r13
	mov rcx, r13
	mov rcx, qword [rcx + 80]
	cmp qword [rcx + rdi * 8 + 8], 0
	je b163
	b164:
	mov rcx, r13
	mov rcx, qword [rcx + 80]
	mov rcx, qword [rcx + rdi * 8 + 8]
	mov qword [rcx + 88], r13
	b163:
	mov rcx, r13
	mov rcx, qword [rcx + 88]
	mov qword [r14 + 88], rcx
	mov rcx, r13
	mov qword [rcx + 88], r14
	cmp qword [r14 + 88], 0
	je b165
	b166:
	mov rbx, qword [r14 + 88]
	mov rcx, qword [r14 + 88]
	mov rsi, r13
	mov rdi, rcx
	call _Node.judge
	mov rdx, rax
	mov rcx, qword [rbx + 80]
	mov qword [rcx + rdx * 8 + 8], r14
	b165:
	mov rcx, r13
	mov rdi, rcx
	call _Node.push_up
	b167:
	pop r14
	pop r13
	pop rbx
	leave
	ret
_Node.rotto:
	b168:
	push rbp
	mov rbp, rsp
	push r12
	push rbx
	push r13
	push r14
	mov rbx, rdi
	mov r13, rsi
	b169:
	mov rcx, qword [rbx + 88]
	mov rdx, r13
	b170:
	cmp rcx, 0
	je b171
	b172:
	cmp rdx, 0
	je b173
	b174:
	mov rcx, qword [rcx]
	cmp rcx, qword [rdx]
	je b175
	b176:
	mov rax, 0
	jmp b177
	b175:
	mov rax, 1
	b177:
	jmp b178
	b173:
	b179:
	mov rax, 0
	b180:
	jmp b178
	b171:
	cmp rdx, 0
	je b181
	b182:
	b183:
	mov rax, 0
	b184:
	jmp b178
	b181:
	b185:
	mov rax, 1
	b186:
	b178:
	cmp rax, 0
	jne b187
	b188:
	mov r14, qword [rbx + 88]
	mov rcx, r14
	mov rcx, qword [rcx + 88]
	mov rdx, r13
	b189:
	cmp rcx, 0
	je b190
	b191:
	cmp rdx, 0
	je b192
	b193:
	mov rcx, qword [rcx]
	cmp rcx, qword [rdx]
	je b194
	b195:
	mov rax, 0
	jmp b196
	b194:
	mov rax, 1
	b196:
	jmp b197
	b192:
	b198:
	mov rax, 0
	b199:
	jmp b197
	b190:
	cmp rdx, 0
	je b200
	b201:
	b202:
	mov rax, 0
	b203:
	jmp b197
	b200:
	b204:
	mov rax, 1
	b205:
	b197:
	cmp rax, 0
	jne b206
	b207:
	mov rcx, r14
	mov rcx, qword [rcx + 88]
	mov rsi, r14
	mov rdi, rcx
	call _Node.judge
	mov r12, rax
	mov rcx, r14
	mov rsi, rbx
	mov rdi, rcx
	call _Node.judge
	mov rcx, rax
	cmp r12, rcx
	je b208
	b209:
	mov rdi, rbx
	call _Node.rot
	mov rdi, rbx
	call _Node.rot
	jmp b210
	b208:
	mov rcx, r14
	mov rdi, rcx
	call _Node.rot
	mov rdi, rbx
	call _Node.rot
	b210:
	jmp b169
	b206:
	mov rdi, rbx
	call _Node.rot
	jmp b169
	b187:
	mov rdi, rbx
	call _Node.push_up
	cmp qword [rbx + 88], 0
	je b211
	b212:
	mov rcx, qword [rbx + 88]
	mov rdi, rcx
	call _Node.push_up
	b211:
	b213:
	pop r14
	pop r13
	pop rbx
	pop r12
	leave
	ret
_splay_tree.splay_tree:
	b214:
	push rbp
	mov rbp, rsp
	mov rcx, rdi
	mov qword [rcx], 0
	mov rax, 0
	b215:
	leave
	ret
_splay_tree.build:
	b216:
	push rbp
	mov rbp, rsp
	sub rsp, 32
	push r15
	push r12
	push rbx
	push r13
	push r14
	mov qword [rbp - 8], rdi
	mov qword [rbp - 24], rsi
	mov rbx, rdx
	mov r12, rcx
	mov rcx, r8
	mov qword [rbp - 16], rcx
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	mov r13, qword [g_5]
	mov rcx, r12
	mov rdx, qword [rbp - 16]
	add rcx, rdx
	mov rdx, rcx
	mov rcx, 1
	sar rdx, cl
	mov r14, rdx
	mov rdi, 96
	call malloc
	mov rcx, rax
	mov r15, rcx
	mov rdi, r15
	mov rcx, qword [g_9]
	inc rcx
	mov qword [g_9], rcx
	mov rcx, qword [g_9]
	mov rdx, rcx
	mov rsi, qword [r13 + r14 * 8 + 8]
	call _Node.init
	mov rcx, qword [rbp - 24]
	mov rsi, r15
	mov rdi, rcx
	call _Node.copy
	mov rcx, qword [rbp - 24]
	mov qword [rcx + 88], rbx
	cmp r12, r14
	jge b217
	b218:
	mov rcx, qword [rbp - 24]
	mov rbx, qword [rcx + 80]
	mov rdi, 96
	call malloc
	mov rcx, rax
	mov qword [rbx + 8], rcx
	mov rcx, qword [rbp - 24]
	mov rcx, qword [rcx + 80]
	mov rdi, qword [rcx + 8]
	mov rcx, qword [g_9]
	inc rcx
	mov qword [g_9], rcx
	mov rcx, qword [g_9]
	mov rdx, rcx
	mov rsi, 0
	call _Node.init
	mov rcx, qword [rbp - 24]
	mov rsi, qword [rcx + 80]
	mov rdx, r14
	sub rdx, 1
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	mov qword [g_5], r13
	mov r8, rdx
	mov rcx, r12
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rsi + 8]
	mov rdi, qword [rbp - 8]
	call _splay_tree.build
	mov r13, qword [g_5]
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	b217:
	mov rcx, qword [rbp - 16]
	cmp rcx, r14
	jle b219
	b220:
	mov rcx, qword [rbp - 24]
	mov rbx, qword [rcx + 80]
	mov rdi, 96
	call malloc
	mov rcx, rax
	mov qword [rbx + 16], rcx
	mov rcx, qword [rbp - 24]
	mov rcx, qword [rcx + 80]
	mov rdi, qword [rcx + 16]
	mov rcx, qword [g_9]
	inc rcx
	mov qword [g_9], rcx
	mov rcx, qword [g_9]
	mov rdx, rcx
	mov rsi, 0
	call _Node.init
	mov rcx, qword [rbp - 24]
	mov rsi, qword [rcx + 80]
	mov rdx, r14
	add rdx, 1
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	mov qword [g_5], r13
	mov rcx, qword [rbp - 16]
	mov r8, rcx
	mov rcx, rdx
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rsi + 16]
	mov rdi, qword [rbp - 8]
	call _splay_tree.build
	mov r13, qword [g_5]
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	b219:
	mov rcx, qword [rbp - 24]
	mov rdi, rcx
	call _Node.push_up
	b221:
	mov rcx, qword [g_9]
	mov qword [g_9], rcx
	mov qword [g_5], r13
	pop r14
	pop r13
	pop rbx
	pop r12
	pop r15
	leave
	ret
_splay_tree.build_tree:
	b222:
	push rbp
	mov rbp, rsp
	push r12
	push rbx
	push r13
	push r14
	mov r13, rdi
	mov r14, rsi
	mov rbx, rdx
	mov r12, qword [g_9]
	mov rdi, 96
	call malloc
	mov rcx, rax
	mov qword [r13], rcx
	mov rcx, qword [r13]
	inc r12
	mov rdx, r12
	mov rsi, 0
	mov rdi, rcx
	call _Node.init
	mov qword [g_9], r12
	mov r8, rbx
	mov rcx, r14
	mov rdx, 0
	mov rsi, qword [r13]
	mov rdi, r13
	call _splay_tree.build
	mov r12, qword [g_9]
	b223:
	mov qword [g_9], r12
	pop r14
	pop r13
	pop rbx
	pop r12
	leave
	ret
_splay_tree.find:
	b224:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov rcx, rdi
	mov r13, rsi
	mov rbx, qword [rcx]
	mov r14, 0
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	cmp qword [rcx + 8], 0
	jne b225
	b226:
	mov rcx, 1
	jmp b227
	b225:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rcx, qword [rcx + 8]
	mov rcx, qword [rcx + 16]
	add rcx, 1
	b227:
	b228:
	mov rdx, r14
	add rdx, rcx
	cmp rdx, r13
	jne b229
	b230:
	mov rax, rbx
	b231:
	pop r14
	pop r13
	pop rbx
	leave
	ret
	b229:
	mov rdx, r14
	add rdx, rcx
	cmp r13, rdx
	jl b232
	b233:
	add r14, rcx
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rbx, qword [rcx + 16]
	jmp b234
	b232:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rbx, qword [rcx + 8]
	b234:
	mov rcx, rbx
	mov rdi, rcx
	call _Node.push_down
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	cmp qword [rcx + 8], 0
	jne b235
	b236:
	mov rcx, 1
	jmp b237
	b235:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rcx, qword [rcx + 8]
	mov rcx, qword [rcx + 16]
	add rcx, 1
	b237:
	jmp b228
_splay_tree.dfs:
	b238:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov r14, rdi
	mov rbx, rsi
	mov r13, 0
	b239:
	cmp r13, 2
	jl b240
	b241:
	b242:
	pop r14
	pop r13
	pop rbx
	leave
	ret
	b240:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	cmp qword [rcx + r13 * 8 + 8], 0
	je b243
	b244:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rsi, qword [rcx + r13 * 8 + 8]
	mov rdi, r14
	call _splay_tree.dfs
	b243:
	b245:
	inc r13
	jmp b239
_splay_tree.del:
	b246:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov r13, rdi
	mov r14, rsi
	mov rcx, rdx
	add rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov rbx, rcx
	mov rcx, rbx
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], rbx
	mov rcx, r14
	sub rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov rbx, rcx
	mov rcx, rbx
	mov rsi, qword [r13]
	mov rdi, rcx
	call _Node.rotto
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	cmp qword [rcx + 16], 0
	je b247
	b248:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov rsi, qword [rcx + 16]
	mov rdi, r13
	call _splay_tree.dfs
	b247:
	mov rcx, rbx
	mov rcx, qword [rcx + 80]
	mov qword [rcx + 16], 0
	mov rcx, rbx
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], rbx
	b249:
	pop r14
	pop r13
	pop rbx
	leave
	ret
_splay_tree.change:
	b250:
	push rbp
	mov rbp, rsp
	push r12
	push rbx
	push r13
	push r14
	mov r13, rdi
	mov r12, rsi
	mov rbx, rcx
	mov rcx, rdx
	add rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov r14, rcx
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], r14
	mov rcx, r12
	sub rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov r14, rcx
	mov rcx, r14
	mov rsi, qword [r13]
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r14
	mov rcx, qword [rcx + 80]
	mov r14, qword [rcx + 16]
	mov rcx, r14
	mov rdi, rcx
	call _Node.push_down
	mov rcx, r14
	mov rsi, rbx
	mov rdi, rcx
	call _Node.addtag_ch
	mov rcx, r14
	mov rdi, rcx
	call _Node.push_down
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], r14
	b251:
	pop r14
	pop r13
	pop rbx
	pop r12
	leave
	ret
_splay_tree.rol:
	b252:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov r14, rdi
	mov rbx, rsi
	mov rcx, rdx
	add rcx, 1
	mov rsi, rcx
	mov rdi, r14
	call _splay_tree.find
	mov rcx, rax
	mov r13, rcx
	mov rcx, r13
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r14], r13
	mov rcx, rbx
	sub rcx, 1
	mov rsi, rcx
	mov rdi, r14
	call _splay_tree.find
	mov rcx, rax
	mov r13, rcx
	mov rcx, r13
	mov rsi, qword [r14]
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r13
	mov rcx, qword [rcx + 80]
	mov r13, qword [rcx + 16]
	mov rcx, r13
	mov rdi, rcx
	call _Node.push_down
	mov rcx, r13
	mov rdi, rcx
	call _Node.addtag_ro
	mov rcx, r13
	mov rdi, rcx
	call _Node.push_down
	mov rcx, r13
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r14], r13
	b253:
	pop r14
	pop r13
	pop rbx
	leave
	ret
_splay_tree.getsum:
	b254:
	push rbp
	mov rbp, rsp
	push rbx
	push r13
	push r14
	mov r13, rdi
	mov rbx, rsi
	mov rcx, rdx
	add rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov r14, rcx
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], r14
	mov rcx, rbx
	sub rcx, 1
	mov rsi, rcx
	mov rdi, r13
	call _splay_tree.find
	mov rcx, rax
	mov r14, rcx
	mov rcx, r14
	mov rsi, qword [r13]
	mov rdi, rcx
	call _Node.rotto
	mov rcx, r14
	mov rcx, qword [rcx + 80]
	mov r14, qword [rcx + 16]
	mov rcx, r14
	mov rdi, rcx
	call _Node.push_down
	mov rcx, r14
	mov rbx, qword [rcx + 24]
	mov rcx, r14
	mov rsi, 0
	mov rdi, rcx
	call _Node.rotto
	mov qword [r13], r14
	mov rax, rbx
	b255:
	pop r14
	pop r13
	pop rbx
	leave
	ret
_splay_tree.getMax:
	b256:
	push rbp
	mov rbp, rsp
	push r14
	mov r14, rdi
	mov rcx, qword [r14]
	mov rdi, rcx
	call _Node.push_down
	mov rcx, qword [r14]
	mov rax, qword [rcx + 72]
	b257:
	pop r14
	leave
	ret
__init:
	b258:
	push rbp
	mov rbp, rsp
	push r15
	push r12
	push rbx
	push r13
	push r14
	mov rbx, 1000000000
	mov rcx, 4000010
	mov r13, 0
	mov r14, 4000010
	lea rdx, [r14 * 8 + 8]
	mov rdi, rdx
	call malloc
	mov rcx, rax
	mov qword [rcx], 4000010
	b259:
	cmp r14, 0
	jg b260
	b261:
	mov rdx, g_10
	mov qword [g_9], r13
	mov qword [g_3], rbx
	mov qword [g_5], rcx
	mov qword [g_6], rdx
	call _main
	mov rdx, qword [g_6]
	mov rcx, qword [g_5]
	mov rbx, qword [g_3]
	mov r13, qword [g_9]
	pop r14
	pop r13
	pop rbx
	pop r12
	pop r15
	leave
	ret
	b260:
	mov qword [rcx + r14 * 8], 0
	dec r14
	jmp b259
	section .data
g_3:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_11:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_2:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_4:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_9:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_5:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_0:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_1:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_6:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_7:
	dq 2
	db 30H, 0AH, 00H
g_8:
	dq 1
	db 0AH, 00H
g_10:
	dq 2
	db 49H, 44H, 00H
