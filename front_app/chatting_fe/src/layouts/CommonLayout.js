import { Outlet } from 'react-router-dom';
import Header from '../outlines/Header';
import Footer from '../outlines/Footer';

const CommonLayout = () => {
    return (
      <>
        <Header />
          <Outlet />
        <Footer />
      </>
    );
};

export default CommonLayout;