execute as @a[tag=!in_hotel] in hotel_zero:hotel run tp @s -6.009 139 11.575
execute as @a[tag=!in_hotel] run tellraw @s {"text":"Welcome To the Hotel!\n","color":"red"}
execute as @a[tag=!in_hotel] run tellraw @s {"text":"In This,You Are A Worker\n","color":"red"}
execute as @a[tag=!in_hotel] run tellraw @s {"text":"You Can Read The Worker Rules\n","color":"red"}
execute as @a[tag=!in_hotel] run tellraw @s {"text":"Have A Good Luck For You!","color":"red"}
execute as @a[tag=!in_hotel] run tag @s add in_hotel
