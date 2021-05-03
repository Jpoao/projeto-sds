import BarCharts from "components/BarChart";
import DataTable from "components/DataTable";
import DonultChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">DashBoard de vendas</h1>
        <div className="row px-3">
          <div className="col sm-6">
            <h5 className="text-center text-secundary"> Taxa de sucesso (%) </h5>
            <BarCharts />
          </div>
          <div className="col sm-6">
            <h5 className="text-center text-secundary"> Todas as vendas </h5>
            <DonultChart />
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary"> Todas Vendas </h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
