public static boolen isfourakind( Card[] h)
{
boolean a1, a2;
if(h.length!=5)
return(false);
sortByRank(h);
a1 = h[0].rank() == h[1].rank() && h[1].rank() == h[2].rank() && h[2].rank() == h[3].rank();
a2 = h[1].rank() == h[2].rank() && h[2].rank() == h[3].rank() && h[3].rank() == h[4].rank();
return (a1||a2);
}

public static boolean isFullHouse( Card[] h){
boolean a1, a2;
if(h.length != 5)
return(false);
sortByRank(h);
a1 = h[0].rank() == h[1].rank() && h[1].rank() == h[2].rank() && h[3].rank() == h[4].rank();
a2 = h[0].rank() == h[1].rank() && h[2].rank() == h[3].rank() && h[3].rank() == h[4].rank();
return (a1||a2);
}

public static boolean isthreeakind( card[] h){
boolean a1, a2,a3;
if(h.leangth != 5)
return(false);
sortByRank(h);
a1 = h[0].rank() == h[1].rank() && h[1].rank == h[2].rank() && h[3].rank() != h[0].rank() && h[4].rank() != h[0].rank() && h[3].rank() != h[4].rank();
a2 = h[1].rank() == h[2].rank() && h[2].rank == h[3].rank() && h[0].rank() != h[1].rank() && h[4].rank() != h[1].rank() && h[0].rank() != h[4].rank();
a3 = h[2].rank() == h[3].rank() && h[3].rank == h[4].rank() && h[0].rank() != h[2].rank() && h[1].rank() != h[2].rank() && h[0].rank() != h[1].rank();

return(a1||a2||a3);
}

