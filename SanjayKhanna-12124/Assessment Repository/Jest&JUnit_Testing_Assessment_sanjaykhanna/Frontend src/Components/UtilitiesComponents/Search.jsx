import { TextField } from '@mui/material';
import React from 'react';

const Search = (props) => {
    return (
            <TextField 
            name="search" 
            size='small' 
            autoComplete='off'  
            placeholder='Search...' 
            value={props.search} 
            onChange={(e)=>props.setSearch(e.target.value)} 
            fullWidth
            variant="outlined" />
    );
}

export default Search;
