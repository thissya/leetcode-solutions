import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(weather)
    pt=df.pivot_table(index='month',columns='city',values='temperature',aggfunc='first')
    return pt
