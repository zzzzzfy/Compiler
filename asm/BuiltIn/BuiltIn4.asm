





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
_check:
	b0:
	push rbp
	mov rbp, rsp
	mov rdi, qword [g_0]
	mov r9, qword [g_1]
	mov r10, qword [g_2]
	mov rsi, 0
	b1:
	cmp rsi, r9
	jl b2
	b3:
	mov rax, 1
	jmp b4
	b2:
	mov rcx, 0
	mov r8, 0
	b5:
	cmp r8, 3
	jl b6
	b7:
	cmp rcx, 0
	je b8
	b9:
	b10:
	inc rsi
	jmp b1
	b8:
	mov rax, 0
	b4:
	mov qword [g_0], rdi
	mov qword [g_1], r9
	mov qword [g_2], r10
	leave
	ret
	b6:
	mov rdx, qword [rdi + rsi * 8 + 8]
	mov rdx, qword [rdx + r8 * 8 + 8]
	cmp rdx, 0
	jle b11
	b12:
	cmp qword [r10 + rdx * 8 + 8], 1
	jne b11
	b13:
	mov rcx, 1
	b11:
	cmp rdx, 0
	jge b14
	b15:
	neg rdx
	cmp qword [r10 + rdx * 8 + 8], 0
	jne b14
	b16:
	mov rcx, 1
	b14:
	b17:
	inc r8
	jmp b5
_myprint:
	b18:
	push rbp
	mov rbp, rsp
	push r13
	push r12
	push rbx
	mov rbx, rdi
	mov r13, qword [g_3]
	mov r12, 0
	b19:
	mov rcx, rbx
	mov rdi, rcx
	call __string_length
	mov rcx, rax
	cmp r12, rcx
	jl b20
	b21:
	b22:
	mov qword [g_3], r13
	pop rbx
	pop r12
	pop r13
	leave
	ret
	b20:
	mov rcx, rbx
	mov rsi, r12
	mov rdi, rcx
	call __string_ord
	mov rcx, rax
	add r13, rcx
	b23:
	inc r12
	jmp b19
_payoff:
	b24:
	push rbp
	mov rbp, rsp
	mov rdx, rdi
	mov r8, rsi
	mov rcx, 0
	mov rdi, 0
	b25:
	cmp rdi, 3
	jl b26
	b27:
	mov rax, rcx
	b28:
	leave
	ret
	b26:
	mov rsi, qword [rdx + rdi * 8 + 8]
	cmp rsi, qword [r8 + rdi * 8 + 8]
	je b29
	b30:
	inc rcx
	b29:
	b31:
	inc rdi
	jmp b25
_print_cond:
	b32:
	push rbp
	mov rbp, rsp
	push r15
	push r13
	push r12
	push rbx
	mov rcx, rdi
	mov rbx, qword [g_4]
	mov r13, qword [g_5]
	mov r12, qword [g_2]
	cmp rcx, r13
	je b33
	b34:
	add rcx, 1
	mov qword [rbx + rcx * 8 + 8], 1
	mov r15, rcx
	mov qword [g_4], rbx
	mov qword [g_5], r13
	mov qword [g_2], r12
	mov rdi, r15
	call _print_cond
	mov r12, qword [g_2]
	mov r13, qword [g_5]
	mov rbx, qword [g_4]
	mov rcx, r15
	mov qword [rbx + rcx * 8 + 8], 0
	mov rcx, r15
	mov qword [g_4], rbx
	mov qword [g_5], r13
	mov qword [g_2], r12
	mov rdi, rcx
	call _print_cond
	mov r12, qword [g_2]
	mov r13, qword [g_5]
	mov rbx, qword [g_4]
	jmp b35
	b33:
	mov rsi, rbx
	mov rdx, r12
	b36:
	mov rcx, 0
	mov rdi, 0
	b37:
	cmp rdi, 3
	jl b38
	b39:
	mov rax, rcx
	b40:
	mov rcx, rax
	mov rdi, rcx
	call __toString
	mov rcx, rax
	mov rsi, rcx
	mov rdi, g_6
	call __stringConcate
	mov rcx, rax
	mov rsi, g_7
	mov rdi, rcx
	call __stringConcate
	mov rcx, rax
	mov rdi, rcx
	call _myprint
	mov r15, 0
	b41:
	cmp r15, r13
	jl b42
	b43:
	b35:
	mov qword [g_4], rbx
	mov qword [g_5], r13
	mov qword [g_2], r12
	pop rbx
	pop r12
	pop r13
	pop r15
	leave
	ret
	b42:
	mov rax, r15
	cdq
	mov rcx, 10
	idiv rcx
	mov rcx, rdx
	cmp rcx, 0
	jne b44
	b45:
	mov rcx, r15
	add rcx, 1
	mov rdi, qword [rbx + rcx * 8 + 8]
	call __toString
	mov rcx, rax
	mov rdi, rcx
	call _myprint
	b44:
	b46:
	inc r15
	jmp b41
	b38:
	mov r8, qword [rsi + rdi * 8 + 8]
	cmp r8, qword [rdx + rdi * 8 + 8]
	je b47
	b48:
	inc rcx
	b47:
	b49:
	inc rdi
	jmp b37
_dfs:
	b50:
	push rbp
	mov rbp, rsp
	push r13
	push r12
	push rbx
	mov rcx, rdi
	mov r12, qword [g_5]
	mov r13, qword [g_2]
	cmp rcx, r12
	je b51
	b52:
	mov rbx, rcx
	add rbx, 1
	mov qword [r13 + rbx * 8 + 8], 1
	mov rcx, rbx
	mov qword [g_5], r12
	mov qword [g_2], r13
	mov rdi, rcx
	call _dfs
	mov r13, qword [g_2]
	mov r12, qword [g_5]
	mov rcx, rbx
	mov qword [r13 + rcx * 8 + 8], 0
	mov rcx, rbx
	mov qword [g_5], r12
	mov qword [g_2], r13
	mov rdi, rcx
	call _dfs
	mov r13, qword [g_2]
	mov r12, qword [g_5]
	jmp b53
	b51:
	mov qword [g_2], r13
	call _check
	mov r13, qword [g_2]
	mov rcx, rax
	cmp rcx, 1
	jne b54
	b55:
	mov rdi, g_8
	call _myprint
	mov qword [g_5], r12
	mov qword [g_2], r13
	mov rdi, 0
	call _print_cond
	mov r13, qword [g_2]
	mov r12, qword [g_5]
	mov rdi, g_9
	call _myprint
	b54:
	b53:
	mov qword [g_5], r12
	mov qword [g_2], r13
	pop rbx
	pop r12
	pop r13
	leave
	ret
_print_last_cond:
	b56:
	push rbp
	mov rbp, rsp
	push r15
	push r13
	push r12
	push rbx
	mov rcx, rdi
	mov r12, qword [g_5]
	mov r13, qword [g_2]
	cmp rcx, r12
	je b57
	b58:
	add rcx, 1
	mov qword [r13 + rcx * 8 + 8], 1
	mov rbx, rcx
	mov qword [g_5], r12
	mov qword [g_2], r13
	mov rdi, rbx
	call _print_last_cond
	mov r13, qword [g_2]
	mov r12, qword [g_5]
	mov rcx, rbx
	mov qword [r13 + rcx * 8 + 8], 0
	mov qword [g_5], r12
	mov qword [g_2], r13
	mov rdi, rcx
	call _print_last_cond
	mov r13, qword [g_2]
	mov r12, qword [g_5]
	jmp b59
	b57:
	mov rdi, g_10
	call _myprint
	mov rbx, 1
	mov r15, 0
	b60:
	cmp r15, r12
	jl b61
	b62:
	cmp rbx, 0
	je b63
	b64:
	mov rdi, g_11
	call _myprint
	jmp b65
	b63:
	mov rdi, g_12
	call _myprint
	b65:
	b59:
	mov qword [g_5], r12
	mov qword [g_2], r13
	pop rbx
	pop r12
	pop r13
	pop r15
	leave
	ret
	b61:
	mov rcx, r15
	add rcx, 1
	cmp qword [r13 + rcx * 8 + 8], 1
	jne b66
	b67:
	mov rbx, 0
	b66:
	mov rcx, r15
	add rcx, 1
	mov rdi, qword [r13 + rcx * 8 + 8]
	call __toString
	mov rcx, rax
	mov rdi, rcx
	call _myprint
	b68:
	inc r15
	jmp b60
_main:
	b69:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	push r14
	push r15
	push r13
	push r12
	push rbx
	mov rcx, qword [g_13]
	mov qword [g_13], rcx
	mov r14, qword [g_4]
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rbx, qword [g_0]
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov r15, qword [g_2]
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rcx, qword [g_14]
	mov qword [g_14], rcx
	call __getInt
	mov rcx, rax
	mov qword [g_14], rcx
	mov rax, 2
	mov rcx, qword [g_14]
	imul rcx
	mov rcx, rax
	add rcx, 1
	mov qword [g_5], rcx
	mov rcx, qword [g_14]
	mov qword [g_1], rcx
	mov rcx, 1
	mov qword [g_13], rcx
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rdi, g_15
	call _myprint
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rcx, qword [g_1]
	mov rbx, rcx
	lea r12, [rbx * 8 + 8]
	mov rdi, r12
	call malloc
	mov rcx, rax
	mov qword [rcx], rbx
	b70:
	cmp rbx, 0
	jg b71
	b72:
	mov rbx, rcx
	mov r12, 0
	b73:
	mov rcx, qword [g_1]
	cmp r12, rcx
	jl b74
	b75:
	mov rcx, qword [g_5]
	add rcx, 1
	mov r12, rcx
	mov rcx, qword [rbp - 16]
	lea rcx, [r12 * 8 + 8]
	mov qword [rbp - 16], rcx
	mov rcx, qword [rbp - 16]
	mov rdi, rcx
	call malloc
	mov rcx, rax
	mov qword [rcx], r12
	b76:
	cmp r12, 0
	jg b77
	b78:
	mov r15, rcx
	mov rcx, qword [g_5]
	add rcx, 1
	mov r12, rcx
	mov rcx, qword [rbp - 8]
	lea rcx, [r12 * 8 + 8]
	mov qword [rbp - 8], rcx
	mov rcx, qword [rbp - 8]
	mov rdi, rcx
	call malloc
	mov rcx, rax
	mov qword [rcx], r12
	b79:
	cmp r12, 0
	jg b80
	b81:
	mov r14, rcx
	mov qword [g_4], r14
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov qword [g_0], rbx
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov qword [g_2], r15
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rdi, 0
	call _dfs
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov r15, qword [g_2]
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov rbx, qword [g_0]
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov r14, qword [g_4]
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov qword [g_2], r15
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rdi, 0
	call _print_last_cond
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov r15, qword [g_2]
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov rcx, qword [g_3]
	mov rdi, rcx
	call __toString
	mov rcx, rax
	mov rdi, rcx
	call __println
	mov rax, 0
	b82:
	mov rcx, qword [g_13]
	mov qword [g_13], rcx
	mov qword [g_4], r14
	mov rcx, qword [g_5]
	mov qword [g_5], rcx
	mov qword [g_0], rbx
	mov rcx, qword [g_1]
	mov qword [g_1], rcx
	mov qword [g_2], r15
	mov rcx, qword [g_3]
	mov qword [g_3], rcx
	mov rcx, qword [g_14]
	mov qword [g_14], rcx
	pop rbx
	pop r12
	pop r13
	pop r15
	pop r14
	leave
	ret
	b80:
	mov qword [rcx + r12 * 8], 0
	dec r12
	jmp b79
	b77:
	mov qword [rcx + r12 * 8], 0
	dec r12
	jmp b76
	b74:
	mov r15, 3
	lea r13, [r15 * 8 + 8]
	mov rdi, r13
	call malloc
	mov rcx, rax
	mov qword [rcx], 3
	b83:
	cmp r15, 0
	jg b84
	b85:
	mov rdx, rcx
	mov rcx, qword [g_13]
	mov qword [rdx + 8], rcx
	mov rcx, qword [g_13]
	add rcx, 1
	mov qword [rdx + 16], rcx
	mov rcx, qword [g_13]
	add rcx, 2
	mov rsi, rcx
	neg rsi
	mov qword [rdx + 24], rsi
	mov qword [g_13], rcx
	mov qword [rbx + r12 * 8 + 8], rdx
	b86:
	inc r12
	jmp b73
	b84:
	mov qword [rcx + r15 * 8], 0
	dec r15
	jmp b83
	b71:
	mov qword [rcx + rbx * 8], 0
	dec rbx
	jmp b70
__init:
	b87:
	push rbp
	mov rbp, rsp
	push r14
	push r15
	push r13
	push r12
	push rbx
	mov rcx, 0
	mov qword [g_3], rcx
	call _main
	mov rcx, qword [g_3]
	pop rbx
	pop r12
	pop r13
	pop r15
	pop r14
	leave
	ret
	section .data
g_0:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_2:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_4:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_14:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_5:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_1:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_13:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_3:
	db 00H, 00H, 00H, 00H, 00H, 00H, 00H, 00H
g_6:
	dq 2
	db 2DH, 20H, 00H
g_7:
	dq 2
	db 2AH, 78H, 00H
g_8:
	dq 3
	db 78H, 7AH, 20H, 00H
g_9:
	dq 7
	db 20H, 3CH, 3DH, 20H, 30H, 3BH, 0AH, 00H
g_10:
	dq 1
	db 78H, 00H
g_12:
	dq 3
	db 20H, 2BH, 20H, 00H
g_11:
	dq 6
	db 20H, 3DH, 20H, 31H, 3BH, 0AH, 00H
g_15:
	dq 9
	db 6DH, 61H, 78H, 3AH, 20H, 78H, 7AH, 3BH, 0AH, 00H
