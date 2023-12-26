package com.example.projectrevisi

class SumberBerita {
    companion object {
        fun buatSetData(): ArrayList<ListObjBerita> {
            val list = ArrayList<ListObjBerita>()

            list.add(
                ListObjBerita(
                    "Momen Menko PMK Bicara Strategi 0% Kemiskinan Ekstrem di 2024",
                    "Menteri Koordinator Bidang Pembangunan Manusia dan Kebudayaan (Menko PMK) Muhadjir Effendy berbicara mengenai strategi penghapusan kemiskinan ekstrem di Kemenko PMK, Jakarta, Senin (18/12/2023). Hal ini sesuai target Presiden Jokowi yang ingin tidak ada lagi kemiskinan ekstrem",
                    gambarBerita = "https://akcdn.detik.net.id/community/media/visual/2023/12/18/momen-menko-pmk-bicara-strategi-0-kemiskinan-ekstrem-di-2024-1_169.jpeg?w=700&q=90"
                )
            )

            list.add(
                ListObjBerita(
                    "Upaya Pemkab Bojonegoro Turunkan Kemiskinan Dipuji Kemenko PMK",
                    "Jakarta - Deputi Bidang Koordinasi Peningkatan Kesejahteraan Sosial Kementerian Koordinator (Kemenko) Bidang Pembangunan Manusia dan Kebudayaan (PMK) Nunung Nuryartono mengapresiasi kinerja Pemerintah Kabupaten Bojonegoro turunkan kemiskinan",
                    gambarBerita = "https://akcdn.detik.net.id/community/media/visual/2023/12/18/momen-menko-pmk-bicara-strategi-0-kemiskinan-ekstrem-di-2024-1_169.jpeg?w=700&q=90"
                )
            )

            list.add(
                ListObjBerita(
                    "Geliat Sumenep Menurunkan Kemiskinan",
                    "Jakarta - Kabupaten Sumenep berlokasi di ujung paling timur Pulau Madura. Meskipun terletak di paling ujung timur Madura, namun kabupaten ini memiliki jumlah penduduk terbanyak dibanding tiga kabupaten lainnya di Madura. Pada tahun 2023 jumlah penduduk Kabupaten Sumenep berjumlah 1,13 juta jiwa, sementara Kabupaten Pamekasan jumlah penduduknya mencapai 857,8 ribu jiwa, Kabupaten Sampang mencapai 984 ribu jiwa dan Bangkalan sebanyak 1,08 juta jiwa",
                    gambarBerita = "https://akcdn.detik.net.id/community/media/visual/2023/12/18/momen-menko-pmk-bicara-strategi-0-kemiskinan-ekstrem-di-2024-1_169.jpeg?w=700&q=90"
                )
            )
            return list
        }
    }
}