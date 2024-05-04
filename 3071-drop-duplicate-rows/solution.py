import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(customers)
    df=df.drop_duplicates(subset=['email'])
    return df
