import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(animals)
    df=df[df['weight']>100]
    df=df.sort_values(by=['weight'],ascending=False)
    df=df['name']
    df=df.to_frame()
    return df
