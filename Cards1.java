
int topStraightValue=0;boolean straight=false;    
for (int x=1; x<=9; x++) 
{
    if (ranks[x]==1 && ranks[x+1]==1 && ranks[x+2]==1 && 
        ranks[x+3]==1 && ranks[x+4]==1)
    {
        straight=true;
        topStraightValue=x+4; 
        break;
    }
}

if (ranks[10]==1 && ranks[11]==1 && ranks[12]==1 && 
    ranks[13]==1 && ranks[1]==1) {
    straight=true;
    topStraightValue=14; 
}
