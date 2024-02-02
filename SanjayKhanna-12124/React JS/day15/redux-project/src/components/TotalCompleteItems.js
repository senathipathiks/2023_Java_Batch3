import React from 'react';

const TotalCompleteItems = ({ totalCompleteItems }) => {
	return (
		<div className='card bg-info text-white mt-3'>
			<div className='card-body'>
				<h3>Total Complete Items:</h3>
				<h2>{totalCompleteItems}</h2>
			</div>
		</div>
	);
};

export default TotalCompleteItems;