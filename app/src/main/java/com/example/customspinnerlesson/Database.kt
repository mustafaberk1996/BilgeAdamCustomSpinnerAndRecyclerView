package com.example.customspinnerlesson

import java.util.Date

object Database {


    val videos = listOf(
        Video(1,"GÜLERSEN, KAYBEDERSİN! | Soğuk Savaş S2E24 w/ Cem İşçiler, Dilek Çelebi Tunç & Onur Gökçek","Soguk Savas",32526234,"https://i.ytimg.com/vi/bGsZnkvYRIk/maxresdefault.jpg","https://yt3.googleusercontent.com/vKMrfm8FRukIUenBloGXW7ArNa26wXqsNJrsrdFszMokmQwJR8RERKTtECDhJWBXSdqcyzZISg=s176-c-k-c0x00ffffff-no-rj", Date(),"12:55"),
        Video(2,"MÜZİSYENLER | Harbi Hayatlar | Röportaj Adam","Roportaj Adam",1414141,"https://i.ytimg.com/vi/WTWgCbY21pE/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaSdyJVzwkZToZDNuzqKEMTAo-kLVjQAYPYHm417qQ=s176-c-k-c0x00ffffff-no-rj",Date(),"1:3:12"),
        Video(3,"| Samuel Vanunu'nun İhaneti | - Kurtlar Vadisi (ÖZEL YAPIM)","Kurtlar Vadisi Derin Devlet ve Mafya",52221,"https://i.ytimg.com/vi/YdlTLOQGagU/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaRhxR-hvaxWpHezKe9U3ILu07oCeARgTTNcEK0--Q=s176-c-k-c0x00ffffff-no-rj",Date(),"45:23"),
        Video(1,"GÜLERSEN, KAYBEDERSİN! | Soğuk Savaş S2E24 w/ Cem İşçiler, Dilek Çelebi Tunç & Onur Gökçek","Soguk Savas",32526234,"https://i.ytimg.com/vi/bGsZnkvYRIk/maxresdefault.jpg","https://yt3.googleusercontent.com/vKMrfm8FRukIUenBloGXW7ArNa26wXqsNJrsrdFszMokmQwJR8RERKTtECDhJWBXSdqcyzZISg=s176-c-k-c0x00ffffff-no-rj", Date(),"12:55"),
        Video(2,"MÜZİSYENLER | Harbi Hayatlar | Röportaj Adam","Roportaj Adam",1414141,"https://i.ytimg.com/vi/WTWgCbY21pE/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaSdyJVzwkZToZDNuzqKEMTAo-kLVjQAYPYHm417qQ=s176-c-k-c0x00ffffff-no-rj",Date(),"1:3:12"),
        Video(3,"| Samuel Vanunu'nun İhaneti | - Kurtlar Vadisi (ÖZEL YAPIM)","Kurtlar Vadisi Derin Devlet ve Mafya",52221,"https://i.ytimg.com/vi/YdlTLOQGagU/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaRhxR-hvaxWpHezKe9U3ILu07oCeARgTTNcEK0--Q=s176-c-k-c0x00ffffff-no-rj",Date(),"45:23"),
        Video(1,"GÜLERSEN, KAYBEDERSİN! | Soğuk Savaş S2E24 w/ Cem İşçiler, Dilek Çelebi Tunç & Onur Gökçek","Soguk Savas",32526234,"https://i.ytimg.com/vi/bGsZnkvYRIk/maxresdefault.jpg","https://yt3.googleusercontent.com/vKMrfm8FRukIUenBloGXW7ArNa26wXqsNJrsrdFszMokmQwJR8RERKTtECDhJWBXSdqcyzZISg=s176-c-k-c0x00ffffff-no-rj", Date(),"12:55"),
        Video(2,"MÜZİSYENLER | Harbi Hayatlar | Röportaj Adam","Roportaj Adam",1414141,"https://i.ytimg.com/vi/WTWgCbY21pE/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaSdyJVzwkZToZDNuzqKEMTAo-kLVjQAYPYHm417qQ=s176-c-k-c0x00ffffff-no-rj",Date(),"1:3:12"),
        Video(3,"| Samuel Vanunu'nun İhaneti | - Kurtlar Vadisi (ÖZEL YAPIM)","Kurtlar Vadisi Derin Devlet ve Mafya",52221,"https://i.ytimg.com/vi/YdlTLOQGagU/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaRhxR-hvaxWpHezKe9U3ILu07oCeARgTTNcEK0--Q=s176-c-k-c0x00ffffff-no-rj",Date(),"45:23"),
        Video(1,"GÜLERSEN, KAYBEDERSİN! | Soğuk Savaş S2E24 w/ Cem İşçiler, Dilek Çelebi Tunç & Onur Gökçek","Soguk Savas",32526234,"https://i.ytimg.com/vi/bGsZnkvYRIk/maxresdefault.jpg","https://yt3.googleusercontent.com/vKMrfm8FRukIUenBloGXW7ArNa26wXqsNJrsrdFszMokmQwJR8RERKTtECDhJWBXSdqcyzZISg=s176-c-k-c0x00ffffff-no-rj", Date(),"12:55"),
        Video(2,"MÜZİSYENLER | Harbi Hayatlar | Röportaj Adam","Roportaj Adam",1414141,"https://i.ytimg.com/vi/WTWgCbY21pE/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaSdyJVzwkZToZDNuzqKEMTAo-kLVjQAYPYHm417qQ=s176-c-k-c0x00ffffff-no-rj",Date(),"1:3:12"),
        Video(3,"| Samuel Vanunu'nun İhaneti | - Kurtlar Vadisi (ÖZEL YAPIM)","Kurtlar Vadisi Derin Devlet ve Mafya",52221,"https://i.ytimg.com/vi/YdlTLOQGagU/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaRhxR-hvaxWpHezKe9U3ILu07oCeARgTTNcEK0--Q=s176-c-k-c0x00ffffff-no-rj",Date(),"45:23"),
        Video(1,"GÜLERSEN, KAYBEDERSİN! | Soğuk Savaş S2E24 w/ Cem İşçiler, Dilek Çelebi Tunç & Onur Gökçek","Soguk Savas",32526234,"https://i.ytimg.com/vi/bGsZnkvYRIk/maxresdefault.jpg","https://yt3.googleusercontent.com/vKMrfm8FRukIUenBloGXW7ArNa26wXqsNJrsrdFszMokmQwJR8RERKTtECDhJWBXSdqcyzZISg=s176-c-k-c0x00ffffff-no-rj", Date(),"12:55"),
        Video(2,"MÜZİSYENLER | Harbi Hayatlar | Röportaj Adam","Roportaj Adam",1414141,"https://i.ytimg.com/vi/WTWgCbY21pE/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaSdyJVzwkZToZDNuzqKEMTAo-kLVjQAYPYHm417qQ=s176-c-k-c0x00ffffff-no-rj",Date(),"1:3:12"),
        Video(3,"| Samuel Vanunu'nun İhaneti | - Kurtlar Vadisi (ÖZEL YAPIM)","Kurtlar Vadisi Derin Devlet ve Mafya",52221,"https://i.ytimg.com/vi/YdlTLOQGagU/maxresdefault.jpg","https://yt3.googleusercontent.com/ytc/AOPolaRhxR-hvaxWpHezKe9U3ILu07oCeARgTTNcEK0--Q=s176-c-k-c0x00ffffff-no-rj",Date(),"45:23"),


    )
}