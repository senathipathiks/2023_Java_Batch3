import React from "react";
import { motion } from "framer-motion";

const HeaderComponent = () => {
  return (
    <div>
      <header>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark text-light d-flex justify-content-center">
          <div>
            <motion.div
              initial={{ opacity: 0, y: 50 }}
              animate={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5 }}
            >
              <div className="text-center">Employee</div>
            </motion.div>
            {/* <h3>Employee Management Application</h3> */}
          </div>
        </nav>
      </header>
    </div>
  );
};

export default HeaderComponent;
